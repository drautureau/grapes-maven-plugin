package org.axway.grapes.maven.materials.stubs;


import org.apache.maven.artifact.Artifact;

import java.util.Collections;
import java.util.List;

public class SubModule1ProjectStub extends AbstractProjectStub {

    @Override
    public String getProjectPath() {
        return "multi-module-project/subModule1";
    }

    @Override
    public List<Artifact> getAttachedArtifacts() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getModules() {
        return Collections.emptyList();
    }
}
