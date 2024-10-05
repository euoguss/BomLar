package dev.guss.BomLar.sevice;


import dev.guss.BomLar.model.hospedes;
import dev.guss.BomLar.repository.hospedesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class hospedesService {

    /*TODO: Refatorar a instancia */
    @Autowired
    private hospedesRepository repo;

    // Adicionar um hospede
    public hospedes createHospede(hospedes hospede){
        return repo.save(hospede);
    }

    // Mostrar hospedes criados

    // Mostrar um hospede por id

    // Deletar hospede

    // Atualizar hospede

}
