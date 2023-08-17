package gev.solutions.rasapi.models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account 
{
    @Id
    private ObjectId id;
    
    private String uName;

    private String uPassword;

    private int accountStatus;

    private Date accountActive;

    private List<Profile> profileId;
}
