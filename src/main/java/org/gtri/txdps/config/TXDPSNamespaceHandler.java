package org.gtri.txdps.config;

import net.shibboleth.ext.spring.util.BaseSpringNamespaceHandler;


/**
 * Spring namespace handler for the GFIPM BAE data connector namespace.
 */
public class TXDPSNamespaceHandler extends BaseSpringNamespaceHandler {

    /** Namespace for this handler. */
    public static final String NAMESPACE = "urn:global:txdps:4.1:resolver";
    
    /** {@inheritDoc} */
    public void init() {
        // Register Texas DPS Data Connector Parsers.
        registerBeanDefinitionParser(TestDataConnectorParser.TYPE_NAME_RESOLVER,  new TestDataConnectorParser());
        registerBeanDefinitionParser(TxDPSDataConnectorParser.TYPE_NAME_RESOLVER, new TxDPSDataConnectorParser());
        registerBeanDefinitionParser(IIRDataConnectorParser.TYPE_NAME_RESOLVER, new IIRDataConnectorParser());
    }

}
