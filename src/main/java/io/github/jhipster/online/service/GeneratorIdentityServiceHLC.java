package io.github.jhipster.online.service;

import io.github.jhipster.online.domain.GeneratorIdentity;
import io.github.jhipster.online.domain.User;
import io.github.jhipster.online.repository.GeneratorIdentityRepository;
import io.github.jhipster.online.service.dto.GeneratorIdentityDTO;
import io.github.jhipster.online.service.mapper.GeneratorIdentityMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GeneratorIdentityServiceHLC extends GeneratorIdentityService {

    public GeneratorIdentityServiceHLC(
        GeneratorIdentityRepository generatorIdentityRepository,
        GeneratorIdentityMapper generatorIdentityMapper
    ) {
        super(generatorIdentityRepository, generatorIdentityMapper);
    }
}
