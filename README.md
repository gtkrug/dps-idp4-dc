# dps-idp4-dc
IDP4 Dataconnector for Texas DPS

This includes 3 data connectors.  One test connector that reads attribute files found on the filesystem, one that queries an internal TXDPS webservice, and one that queries IIR's 28CFR Certification Checking Service.

Sample configurations are available here:

    <DataConnector id="GfipmTest" xsi:type="txdps:Test"
                   pathToAttributeFiles="/opt/idp4/users/"
                   uidAttribute="uid">
        <InputAttributeDefinition ref="uid" />
    </DataConnector>

    <DataConnector id="IIRTest" xsi:type="txdps:IIRQuery" 
                            emailAttribute="Email"
                            attrName="CFRCertification"
                            queryUrl="https://tca.iir.com/api/LookupTestNotCompleted?code=[ISSUED BY IIR]">
        <InputAttributeDefinition ref="Email" />
    </DataConnector>

    <DataConnector id="DPSRoleQuery" xsi:type="txdps:TxDPSQuery" 
                            uidAttribute="InputAttrName"
                            queryUrl="url of service"
                            serviceAccountCredential="credential"
                            serviceAccountUser="user"
                            attrName="Roles"
        <InputAttributeDefinition ref="InputAttrName" />
    </DataConnector>

The above IIRQuery sample queries the IIR test service that always returns incomplete testing.  For production the queryUrl would be https://tca.iir.com/api/Lookup?code=


