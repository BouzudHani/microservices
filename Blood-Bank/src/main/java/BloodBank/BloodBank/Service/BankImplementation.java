package BloodBank.BloodBank.Service;

import BloodBank.BloodBank.BankRepo.BloodTypeRepo;
import BloodBank.BloodBank.Document.BloodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class BankImplementation implements  BloodBandk {
    @Autowired
    private BloodTypeRepo bloodTypeRepo;

    @Override
    public BloodType Save(BloodType bloodType) {
        return bloodTypeRepo.save(bloodType);

    }

    @Override
    public Collection<BloodType> BloodLessAlert() {
        Collection<BloodType> result =new ArrayList<>();
        bloodTypeRepo.findAll().forEach(bloodType -> {
            if (bloodType.isAlert()==true) result.add(bloodType);
        });
        return result;
    }

    @Override
    public BloodType addBlood(int persentage , String Type) {
        BloodType result = new BloodType();
        Collection <BloodType> coll=bloodTypeRepo.findAll();
        for (BloodType tb : coll
             ) { if(tb.getBloodType().equals(Type)){
                         result=tb;
                         break;
                                }
                 }
        result.setPercentage(persentage);
        return result;
    }
}
