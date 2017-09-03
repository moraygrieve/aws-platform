package com.riekon.data.service;

import com.riekon.data.model.MetaModel;
import com.riekon.data.repository.MetaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetaService {
    public static final Logger logger = LoggerFactory.getLogger(MetaService.class);

    @Autowired
    MetaRepository metaRepository;

    public void addEntry(MetaModel model) { metaRepository.addEntry(model); }

    public void updateEntry(MetaModel model) { metaRepository.updateEntry(model); }

    public void deleteEntry(MetaModel model) { metaRepository.deleteEntry(model); }
}
