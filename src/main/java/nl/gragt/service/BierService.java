package nl.gragt.service;

import nl.gragt.model.Bier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BierService {
    List<Bier> biers = new ArrayList<>(
            Arrays.asList(
                    new Bier("ab", "Amstel", "Amstel", 5.0),
                    new Bier("bb", "Brand", "Brand", 5.0),
                    new Bier("hjb", "Hertog Jan", "Hertog Jan", 5.0),
                    new Bier("at", "Afigem Tripel", "Afigem", 7.5)
            )
    );


    public List<Bier> getAll() {
        return biers;
    }

    public Bier getById(String id) {

        for (Bier bier : biers) {
            if (bier.getId().equals(id)) {
                return bier;
            }
        }
        return null;
    }

    public void addBier(Bier bier)
    {
        biers.add(bier);
    }
}
