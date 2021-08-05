package BloodDonor.Blooddonor.Service;

import BloodDonor.Blooddonor.Document.Donor;

import java.util.Collection;
import java.util.List;

public interface BloodAccont {
    public Collection<Donor> getListOfDonorByTpe(String Type);
    public Donor saveBloodDonor(Donor donor);
    public Donor CreatAccount(String name ,String Phone,String Email, String BloodType ,String Address );
    public List<Donor> Donors();
    public Donor getDonorByName(String UserName);

}
