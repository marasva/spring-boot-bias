package taller.systems.com.example.springbootbias.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class BiasObject {

    @Id
    private String id;

    private String objectName;

    @Lob
    private byte[] data;

    public BiasObject(String objectName, byte[] data) {
        this.objectName = objectName;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getobjectName() {
        return objectName;
    }

    public void setobjectName(String pageName) {
        this.objectName = objectName;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}

