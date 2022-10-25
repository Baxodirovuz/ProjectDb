package Object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String fathersName;
    private String email;
    private String gender;
    private String ipAddress;
    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String country;
    private String countryCode;
    private String jobs;
}
