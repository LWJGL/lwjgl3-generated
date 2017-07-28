/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/ARB/texture_storage.txt">ARB_texture_storage</a> extension.
 * 
 * <p>The texture image specification commands in OpenGL allow each level to be separately specified with different sizes, formats, types and so on, and only
 * imposes consistency checks at draw time. This adds overhead for implementations.</p>
 * 
 * <p>This extension provides a mechanism for specifying the entire structure of a texture in a single call, allowing certain consistency checks and memory
 * allocations to be done up front. Once specified, the format and dimensions of the image array become immutable, to simplify completeness checks in the
 * implementation.</p>
 * 
 * <p>When using this extension, it is no longer possible to supply texture data using TexImage*. Instead, data can be uploaded using TexSubImage*, or
 * produced by other means (such as render-to-texture, mipmap generation, or rendering to a sibling EGLImage).</p>
 * 
 * <p>This extension has complicated interactions with other extensions. The goal of most of these interactions is to ensure that a texture is always mipmap
 * complete (and cube complete for cubemap textures).</p>
 * 
 * <p>Requires {@link GL12 OpenGL 1.2}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public class ARBTextureStorage {

    /** Accepted by the {@code value} parameter of GetTexParameter{if}v. */
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

    static { GL.initialize(); }

    protected ARBTextureStorage() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
        return checkFunctions(
            caps.glTexStorage1D, caps.glTexStorage2D, caps.glTexStorage3D, ext.contains("GL_EXT_direct_state_access") ? caps.glTextureStorage1DEXT : -1L, 
            ext.contains("GL_EXT_direct_state_access") ? caps.glTextureStorage2DEXT : -1L, 
            ext.contains("GL_EXT_direct_state_access") ? caps.glTextureStorage3DEXT : -1L
        );
    }

    // --- [ glTexStorage1D ] ---

    /**
     * Simultaneously specifies storage for all levels of a one-dimensional texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     */
    public static native void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTexStorage2D ] ---

    /**
     * Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     */
    public static native void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTexStorage3D ] ---

    /**
     * Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.
     *
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * @param depth          the depth of the texture, in texels
     */
    public static native void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glTextureStorage1DEXT ] ---

    /**
     * DSA version of {@link #glTexStorage1D TexStorage1D}.
     *
     * @param texture        the texture object to update
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_1D TEXTURE_1D}</td><td>{@link GL11#GL_PROXY_TEXTURE_1D PROXY_TEXTURE_1D}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     */
    public static native void glTextureStorage1DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTextureStorage2DEXT ] ---

    /**
     * DSA version of {@link #glTexStorage2D TexStorage2D}.
     *
     * @param texture        the texture object to update
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_2D TEXTURE_2D}</td><td>{@link GL30#GL_TEXTURE_1D_ARRAY TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_TEXTURE_RECTANGLE TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_TEXTURE_CUBE_MAP TEXTURE_CUBE_MAP}</td></tr><tr><td>{@link GL11#GL_PROXY_TEXTURE_2D PROXY_TEXTURE_2D}</td><td>{@link GL30#GL_PROXY_TEXTURE_1D_ARRAY PROXY_TEXTURE_1D_ARRAY}</td><td>{@link GL31#GL_PROXY_TEXTURE_RECTANGLE PROXY_TEXTURE_RECTANGLE}</td><td>{@link GL13#GL_PROXY_TEXTURE_CUBE_MAP PROXY_TEXTURE_CUBE_MAP}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     */
    public static native void glTextureStorage2DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTextureStorage3DEXT ] ---

    /**
     * DSA version of {@link #glTexStorage3D TexStorage3D}.
     *
     * @param texture        the texture object to update
     * @param target         the target of the operation. One of:<br><table><tr><td>{@link GL12#GL_TEXTURE_3D TEXTURE_3D}</td><td>{@link GL30#GL_TEXTURE_2D_ARRAY TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_TEXTURE_CUBE_MAP_ARRAY TEXTURE_CUBE_MAP_ARRAY}</td><td>{@link GL12#GL_PROXY_TEXTURE_3D PROXY_TEXTURE_3D}</td></tr><tr><td>{@link GL30#GL_PROXY_TEXTURE_2D_ARRAY PROXY_TEXTURE_2D_ARRAY}</td><td>{@link GL40#GL_PROXY_TEXTURE_CUBE_MAP_ARRAY PROXY_TEXTURE_CUBE_MAP_ARRAY}</td></tr></table>
     * @param levels         the number of texture levels
     * @param internalformat the sized internal format to be used to store texture image data
     * @param width          the width of the texture, in texels
     * @param height         the height of the texture, in texels
     * @param depth          the depth of the texture, in texels
     */
    public static native void glTextureStorage3DEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

}