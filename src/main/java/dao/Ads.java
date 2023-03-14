package dao;
import models.Ad;
import java.util.List;

public interface Ads {
    public default List<Ad> all() {
        return null;
    }
}

