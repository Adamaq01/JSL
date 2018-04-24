package org.jsl.shaders;

import org.jsl.ShaderType;

/**
 * Created by Adamaq01 on 27/03/2018.
 */
public abstract class Shader {

    // Shader specific type (vertex/geometry/fragment)
    protected ShaderType type;

    // GLSL Version
    protected int version;

    public Shader(ShaderType type, int version) {
        this.type = type;
        this.version = version;
    }

    // Main function of the shader
    public abstract void main();

    public ShaderType getType() {
        return type;
    }

    public int getVersion() {
        return version;
    }
}
