package org.apereo.cas.config;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.configuration.CasConfigurationProperties;
import org.apereo.cas.configuration.model.support.saml.sps.AbstractSamlSPProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This is {@link CasSamlSPSunshineStateEdResearchAllianceConfiguration}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@Configuration("casSamlSPSunshineStateEdResearchAllianceConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
@Slf4j
public class CasSamlSPSunshineStateEdResearchAllianceConfiguration extends BaseCasSamlSPConfiguration {

    @Override
    protected AbstractSamlSPProperties getServiceProvider() {
        return casProperties.getSamlSp().getSserca();
    }
}
