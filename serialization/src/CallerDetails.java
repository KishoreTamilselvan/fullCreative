import java.io.Serializable;

public class CallerDetails implements Serializable {
    private transient int caller_id=5016;
    private String caller_name="Mark William";
    private String purpos="Business Purpose";
    @Override
    public String toString() {
        return "CallerDetails{" + "caller_id=" + caller_id + ", caller_name='" + caller_name + '\'' + ", purpos='" + purpos + '\'' + '}';
    }
}
