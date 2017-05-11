/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/gles/extensions/NV/NV_texture_array.txt">NV_texture_array</a> extension.
 * 
 * <p>This extension introduces the notion of two-dimensional array textures. An array texture is a collection of two-dimensional images of identical size
 * and format, arranged in layers. Array textures are specified using TexImage3DNV, where the depth is used to indicate the number of layers in the image.</p>
 * 
 * <p>An array texture is accessed as a single unit in a programmable shader, using a single coordinate vector. A single layer is selected, using the "p"
 * texture coordinate, and that layer is then accessed as though it were a two-dimensional texture. The layer coordinate is provided as an unnormalized
 * floating-point value in the range {@code [0,<n>-1]}, where {@code <n>} is the number of layers in the array texture. Texture lookups do not filter
 * between layers, though such filtering can be achieved using programmable shaders. When mipmapping is used, each level of an array texture has the same
 * number of layers as the base level; the number of layers is not reduced as the image size decreases.</p>
 * 
 * <p>Single layers of array textures can be rendered to by binding them to a framebuffer object using the FramebufferTextureLayerNV function.</p>
 */
public class NVTextureArray {

    /**
     * Accepted by the {@code target} parameter of TexImage3DNV, TexSubImage3DNV, CopyTexSubImage3DNV, CompressedTexImage3DNV, CompressedTexSubImage3DNV,
     * TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.
     */
    public static final int GL_TEXTURE_2D_ARRAY_NV = 0x8C1A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv and GetFloatv. */
    public static final int
        GL_TEXTURE_BINDING_2D_ARRAY_NV = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS_NV = 0x88FF;

    /** Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv. */
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER_NV = 0x8CD4;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int GL_SAMPLER_2D_ARRAY_NV = 0x8DC1;

    /** Accepted by the {@code pname} parameter of PixelStorei, GetBooleanv, GetIntegerv and GetFloatv. */
    public static final int
        GL_UNPACK_SKIP_IMAGES_NV  = 0x806D,
        GL_UNPACK_IMAGE_HEIGHT_NV = 0x806E;

    static { GLES.initialize(); }

    protected NVTextureArray() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glTexImage3DNV, caps.glTexSubImage3DNV, caps.glCopyTexSubImage3DNV, caps.glCompressedTexImage3DNV, caps.glCompressedTexSubImage3DNV, 
            caps.glFramebufferTextureLayerNV
        );
    }

    // --- [ glTexImage3DNV ] ---

    public static native void nglTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        nglTexImage3DNV(target, level, internalFormat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexSubImage3DNV ] ---

    public static native void nglTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        nglTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTexSubImage3DNV ] ---

    public static native void glCopyTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);

    // --- [ glCompressedTexImage3DNV ] ---

    public static native void nglCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data) {
        nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedTexImage3DNV(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        nglCompressedTexImage3DNV(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage3DNV ] ---

    public static native void nglCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        nglCompressedTexSubImage3DNV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glFramebufferTextureLayerNV ] ---

    public static native void glFramebufferTextureLayerNV(int target, int attachment, int texture, int level, int layer);

    /** Array version of: {@link #glTexImage3DNV TexImage3DNV} */
    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTexImage3DNV TexImage3DNV} */
    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTexImage3DNV TexImage3DNV} */
    public static void glTexImage3DNV(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    /** Array version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** Array version of: {@link #glTexSubImage3DNV TexSubImage3DNV} */
    public static void glTexSubImage3DNV(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

}