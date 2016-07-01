environment {
    name = 'local'
    jrePath = '/usr/local/java/jdk1.8.0_45/bin/java'
    llmHome = '$LLM_HOME'
    server {
        address = '10.100.236.103'
        user = 'scnusr'
    }
    

    app {
        jmxPort = '9035'
        memParams = ''
        gcParams = '-XX:+UseParallelGC'
        debugPort = '11501'
        processName = 'MY-SAMPLE-APP-LOCAL'
        paths {
            home = '/home/scnusr/my-sample-app'
            log = '/home/scnusr//my-sample-app/log'
            stdoutFile = 'mySampleApp.log'
        }
        encoding = 'UTF-8'
        maxLogFiles = '20'
    }

    cfp {
        instanceName = 'MySampleApp'
        cfpType = '1'
        environment = 'DESAX'
        messageStoreLocation = '10.100.236.95:16100'
        tier {
            memberName = 'PRELOAD'
            controlAddress = '234.10.10.10'
            controlPort = '34111'
            controlTopicName = 'RCMSCtrl.preload'
            isSingleton = 'true'
            logLevel = '5'
            haInstanceName = 'CHAC'
            members {
                lider {
                    name = 'PRELOAD'
                    tierAddress = '10.100.236.103'
                    tierPort = '55060'
                    priority = '0'
                }
            }
        }
        sender {
            ancillaryParams = 'SnapshotCycleMilli=20000'
            dataPort = '23232'
            heartBeatTimeOutMilli = '20000'
            instanceName = 'Preload_Publisher'
            ipVersion = '1'
            limitTransRate = '0'
            logLevel = '5'
            maxMemoryAllowedKBytes = '200000'
            mcastSocketTTL = '1'
            minimalHistoryKBytes = '120000'
            multicastInterface = 'eth1'
            multicastLoop = 'true'
            packetSizeBytes = '1024'
            protocol = '1'
            transRateLimitKbps = '0'
            txTopic {
                reliability = '10'
                transport = '1'
                defaultDestAddress = '239.100.210.99'
                defaultNumAckers = '0'
                defaultNumMandatoryAckers = '0'
                defaultFeedbackMode = '3'
            }
        }
    }

    logging {
        daysAllowed = '3'
        level {
            config = "error"
            hibernate = "error"
            cfp = "info"
        }
    }

    jdbc {
        database {
            driverClassName = 'oracle.jdbc.driver.OracleDriver'
            url = 'jdbc:oracle:thin:@10.100.230.4:1565:activity'
            username = 'APPS_MCN'
            password = 'APPS_MCN'

            show_sql = 'false'

            pool {
                minSize = '5'
                maxSize = '5'
            }
        }
    }
}
