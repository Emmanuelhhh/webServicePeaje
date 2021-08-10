package mx.com.tde.metrorrey.backend.uitls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

@Component("versionUtils")
public class VersionUtils {

    private final BuildProperties buildProperties;

    @Autowired
    public VersionUtils(BuildProperties buildProperties){
        this.buildProperties = buildProperties;
    }

    public String version() {
        return buildProperties.getVersion();
    }
}
