package BloodBank.BloodBank.Service;

import BloodBank.BloodBank.Document.BloodType;

import java.util.Collection;

public interface BloodBandk {
    public BloodType Save(BloodType bloodType);
    public Collection<BloodType> BloodLessAlert();
    public BloodType addBlood(int persentage, String Type);
}
