package BloodDonor.Blooddonor.Service;

import BloodDonor.Blooddonor.Document.Donor;
import BloodDonor.Blooddonor.Repository.DonorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class BloodImplementation implements BloodAccont {
    @Autowired
    private DonorRepo donorRepo;

    @Override
    public Collection<Donor> getListOfDonorByTpe(String Type) {
        Collection<Donor> CollDonor = new ArrayList<>();
        donorRepo.findAll().forEach(donor -> {
            if(donor.getBloodType().equals(Type)) CollDonor.add(donor);
        });
        return CollDonor;
    }

    @Override
    public Donor saveBloodDonor(Donor donor) {
        return donorRepo.save(donor);
    }

    @Override
    public Donor CreatAccount(String name, String Phone, String Email, String BloodType, String Address) {
        Donor donor = null;
        Collection<Donor> donors = donorRepo.findAll();
        int size = donors.size()+1;
            donor= new Donor();
            donor.setId(size);
            donor.setName(name);
            donor.setPhoneNomber(Phone);
            donor.setEmail(Email);
            donor.setBloodType(BloodType);
            donor.setAdresse(Address);
            donorRepo.save(donor);
        return donor;
    }

    @Override
    public List<Donor> Donors() {
        return donorRepo.findAll();
    }

    @Override
    public Donor getDonorByName(String UserName) {
        if(UserName!=null) {
            List<Donor> dons = donorRepo.findAll();
            Donor result = null;
            for (Donor x : dons) {
                if (x.getName().equals(UserName)) {
                    result = x;
                    break;
                }
            }
            return result;
        }else throw new RuntimeException("UserName is null");
    }

    private Boolean CheckPhoneNumber(String Phone){
        Collection<Donor> donors = donorRepo.findAll();
        boolean find = false;
        for (Donor dr : donors ) {
            if (dr.getPhoneNomber().equals(Phone))
            { find= true;
             break;  }
        }
        return find;
    }
    private Boolean CheckEmail(String Email){
        Collection<Donor> donors = donorRepo.findAll();
        boolean find = false;
        for (Donor dr : donors ) {
            if (dr.getEmail().equals(Email))
            { find= true;
                break;  }
        }
        return find;

    }
}
