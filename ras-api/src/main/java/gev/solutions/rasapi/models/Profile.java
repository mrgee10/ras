package gev.solutions.rasapi.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "profiles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile 
{
    @Id
    private ObjectId id;

    private String idNumber;

    private String lrnNumber;

    private int programId;

    
}
