package taller.systems.com.example.springbootbias.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class WikiPage {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String pageName;

    @Lob
    private String data;

    public WikiPage(String pageName, String data) {
        this.pageName = pageName;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpageName() {
        return pageName;
    }

    public void setpageName(String pageName) {
        this.pageName = pageName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
