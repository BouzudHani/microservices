package BloodBank.BloodBank.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Hospital {

        private int id;
        private String HospitalName;
        private int Port;
        private Location  location;

        public Hospital(){
        }

        public Hospital(int id, String hospitalName,int port, Location location) {
            this.id = id;
            HospitalName = hospitalName;
            this.Port=port;
            this.location = location;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public int getPort() {
            return Port;
        }

        public void setPort(int port) {
            Port = port;
        }

        @Override
        public String toString() {
            return "Hospital{" +
                    "id=" + id +
                    ", HospitalName='" + HospitalName + '\'' +
                    ", location=" + location +
                    '}';
        }
    }

