/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.opengl.org/registry/specs/NV/half_float.txt">NV_half_float</a> extension.
 * 
 * <p>This extension introduces a new storage format and data type for half-precision (16-bit) floating-point quantities. The floating-point format is very
 * similar to the IEEE single-precision floating-point standard, except that it has only 5 exponent bits and 10 mantissa bits. Half-precision floats are
 * smaller than full precision floats and provide a larger dynamic range than similarly-sized normalized scalar data types.</p>
 * 
 * <p>This extension allows applications to use half-precision floating point data when specifying vertices or pixel data. It adds new commands to specify
 * vertex attributes using the new data type, and extends the existing vertex array and image specification commands to accept the new data type.</p>
 * 
 * <p>This storage format is also used to represent 16-bit components in the floating-point frame buffers, as defined in the NV_float_buffer extension.</p>
 */
public class NVHalfFloat {

    /**
     * Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, TexCoordPointer, FogCoordPointerEXT, SecondaryColorPointerEXT,
     * VertexWeightPointerEXT, VertexAttribPointerNV, DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
     * and GetTexImage.
     */
    public static final int GL_HALF_FLOAT_NV = 0x140B;

    static { GL.initialize(); }

    protected NVHalfFloat() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
        return checkFunctions(
            caps.glVertex2hNV, caps.glVertex2hvNV, caps.glVertex3hNV, caps.glVertex3hvNV, caps.glVertex4hNV, caps.glVertex4hvNV, caps.glNormal3hNV, 
            caps.glNormal3hvNV, caps.glColor3hNV, caps.glColor3hvNV, caps.glColor4hNV, caps.glColor4hvNV, caps.glTexCoord1hNV, caps.glTexCoord1hvNV, 
            caps.glTexCoord2hNV, caps.glTexCoord2hvNV, caps.glTexCoord3hNV, caps.glTexCoord3hvNV, caps.glTexCoord4hNV, caps.glTexCoord4hvNV, 
            caps.glMultiTexCoord1hNV, caps.glMultiTexCoord1hvNV, caps.glMultiTexCoord2hNV, caps.glMultiTexCoord2hvNV, caps.glMultiTexCoord3hNV, 
            caps.glMultiTexCoord3hvNV, caps.glMultiTexCoord4hNV, caps.glMultiTexCoord4hvNV, ext.contains("GL_EXT_fog_coord") ? caps.glFogCoordhNV : -1L, 
            ext.contains("GL_EXT_fog_coord") ? caps.glFogCoordhvNV : -1L, ext.contains("GL_EXT_secondary_color") ? caps.glSecondaryColor3hNV : -1L, 
            ext.contains("GL_EXT_secondary_color") ? caps.glSecondaryColor3hvNV : -1L, ext.contains("GL_EXT_vertex_weighting") ? caps.glVertexWeighthNV : -1L, 
            ext.contains("GL_EXT_vertex_weighting") ? caps.glVertexWeighthvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib1hNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib1hvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib2hNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib2hvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib3hNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib3hvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib4hNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttrib4hvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttribs1hvNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttribs2hvNV : -1L, ext.contains("GL_NV_vertex_program") ? caps.glVertexAttribs3hvNV : -1L, 
            ext.contains("GL_NV_vertex_program") ? caps.glVertexAttribs4hvNV : -1L
        );
    }

    // --- [ glVertex2hNV ] ---

    public static native void glVertex2hNV(short x, short y);

    // --- [ glVertex2hvNV ] ---

    public static native void nglVertex2hvNV(long v);

    public static void glVertex2hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertex2hvNV(memAddress(v));
    }

    // --- [ glVertex3hNV ] ---

    public static native void glVertex3hNV(short x, short y, short z);

    // --- [ glVertex3hvNV ] ---

    public static native void nglVertex3hvNV(long v);

    public static void glVertex3hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertex3hvNV(memAddress(v));
    }

    // --- [ glVertex4hNV ] ---

    public static native void glVertex4hNV(short x, short y, short z, short w);

    // --- [ glVertex4hvNV ] ---

    public static native void nglVertex4hvNV(long v);

    public static void glVertex4hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertex4hvNV(memAddress(v));
    }

    // --- [ glNormal3hNV ] ---

    public static native void glNormal3hNV(short nx, short ny, short nz);

    // --- [ glNormal3hvNV ] ---

    public static native void nglNormal3hvNV(long v);

    public static void glNormal3hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglNormal3hvNV(memAddress(v));
    }

    // --- [ glColor3hNV ] ---

    public static native void glColor3hNV(short red, short green, short blue);

    // --- [ glColor3hvNV ] ---

    public static native void nglColor3hvNV(long v);

    public static void glColor3hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglColor3hvNV(memAddress(v));
    }

    // --- [ glColor4hNV ] ---

    public static native void glColor4hNV(short red, short green, short blue, short alpha);

    // --- [ glColor4hvNV ] ---

    public static native void nglColor4hvNV(long v);

    public static void glColor4hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglColor4hvNV(memAddress(v));
    }

    // --- [ glTexCoord1hNV ] ---

    public static native void glTexCoord1hNV(short s);

    // --- [ glTexCoord1hvNV ] ---

    public static native void nglTexCoord1hvNV(long v);

    public static void glTexCoord1hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglTexCoord1hvNV(memAddress(v));
    }

    // --- [ glTexCoord2hNV ] ---

    public static native void glTexCoord2hNV(short s, short t);

    // --- [ glTexCoord2hvNV ] ---

    public static native void nglTexCoord2hvNV(long v);

    public static void glTexCoord2hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglTexCoord2hvNV(memAddress(v));
    }

    // --- [ glTexCoord3hNV ] ---

    public static native void glTexCoord3hNV(short s, short t, short r);

    // --- [ glTexCoord3hvNV ] ---

    public static native void nglTexCoord3hvNV(long v);

    public static void glTexCoord3hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglTexCoord3hvNV(memAddress(v));
    }

    // --- [ glTexCoord4hNV ] ---

    public static native void glTexCoord4hNV(short s, short t, short r, short q);

    // --- [ glTexCoord4hvNV ] ---

    public static native void nglTexCoord4hvNV(long v);

    public static void glTexCoord4hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglTexCoord4hvNV(memAddress(v));
    }

    // --- [ glMultiTexCoord1hNV ] ---

    public static native void glMultiTexCoord1hNV(int target, short s);

    // --- [ glMultiTexCoord1hvNV ] ---

    public static native void nglMultiTexCoord1hvNV(int target, long v);

    public static void glMultiTexCoord1hvNV(int target, ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord2hNV ] ---

    public static native void glMultiTexCoord2hNV(int target, short s, short t);

    // --- [ glMultiTexCoord2hvNV ] ---

    public static native void nglMultiTexCoord2hvNV(int target, long v);

    public static void glMultiTexCoord2hvNV(int target, ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord3hNV ] ---

    public static native void glMultiTexCoord3hNV(int target, short s, short t, short r);

    // --- [ glMultiTexCoord3hvNV ] ---

    public static native void nglMultiTexCoord3hvNV(int target, long v);

    public static void glMultiTexCoord3hvNV(int target, ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3hvNV(target, memAddress(v));
    }

    // --- [ glMultiTexCoord4hNV ] ---

    public static native void glMultiTexCoord4hNV(int target, short s, short t, short r, short q);

    // --- [ glMultiTexCoord4hvNV ] ---

    public static native void nglMultiTexCoord4hvNV(int target, long v);

    public static void glMultiTexCoord4hvNV(int target, ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4hvNV(target, memAddress(v));
    }

    // --- [ glFogCoordhNV ] ---

    public static native void glFogCoordhNV(short fog);

    // --- [ glFogCoordhvNV ] ---

    public static native void nglFogCoordhvNV(long fog);

    public static void glFogCoordhvNV(ShortBuffer fog) {
        if (CHECKS) {
            check(fog, 1);
        }
        nglFogCoordhvNV(memAddress(fog));
    }

    // --- [ glSecondaryColor3hNV ] ---

    public static native void glSecondaryColor3hNV(short red, short green, short blue);

    // --- [ glSecondaryColor3hvNV ] ---

    public static native void nglSecondaryColor3hvNV(long v);

    public static void glSecondaryColor3hvNV(ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3hvNV(memAddress(v));
    }

    // --- [ glVertexWeighthNV ] ---

    public static native void glVertexWeighthNV(short weight);

    // --- [ glVertexWeighthvNV ] ---

    public static native void nglVertexWeighthvNV(long weight);

    public static void glVertexWeighthvNV(ShortBuffer weight) {
        if (CHECKS) {
            check(weight, 1);
        }
        nglVertexWeighthvNV(memAddress(weight));
    }

    // --- [ glVertexAttrib1hNV ] ---

    public static native void glVertexAttrib1hNV(int index, short x);

    // --- [ glVertexAttrib1hvNV ] ---

    public static native void nglVertexAttrib1hvNV(int index, long v);

    public static void glVertexAttrib1hvNV(int index, ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib2hNV ] ---

    public static native void glVertexAttrib2hNV(int index, short x, short y);

    // --- [ glVertexAttrib2hvNV ] ---

    public static native void nglVertexAttrib2hvNV(int index, long v);

    public static void glVertexAttrib2hvNV(int index, ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib3hNV ] ---

    public static native void glVertexAttrib3hNV(int index, short x, short y, short z);

    // --- [ glVertexAttrib3hvNV ] ---

    public static native void nglVertexAttrib3hvNV(int index, long v);

    public static void glVertexAttrib3hvNV(int index, ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttrib4hNV ] ---

    public static native void glVertexAttrib4hNV(int index, short x, short y, short z, short w);

    // --- [ glVertexAttrib4hvNV ] ---

    public static native void nglVertexAttrib4hvNV(int index, long v);

    public static void glVertexAttrib4hvNV(int index, ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4hvNV(index, memAddress(v));
    }

    // --- [ glVertexAttribs1hvNV ] ---

    public static native void nglVertexAttribs1hvNV(int index, int n, long v);

    public static void glVertexAttribs1hvNV(int index, ShortBuffer v) {
        nglVertexAttribs1hvNV(index, v.remaining(), memAddress(v));
    }

    // --- [ glVertexAttribs2hvNV ] ---

    public static native void nglVertexAttribs2hvNV(int index, int n, long v);

    public static void glVertexAttribs2hvNV(int index, ShortBuffer v) {
        nglVertexAttribs2hvNV(index, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glVertexAttribs3hvNV ] ---

    public static native void nglVertexAttribs3hvNV(int index, int n, long v);

    public static void glVertexAttribs3hvNV(int index, ShortBuffer v) {
        nglVertexAttribs3hvNV(index, v.remaining() / 3, memAddress(v));
    }

    // --- [ glVertexAttribs4hvNV ] ---

    public static native void nglVertexAttribs4hvNV(int index, int n, long v);

    public static void glVertexAttribs4hvNV(int index, ShortBuffer v) {
        nglVertexAttribs4hvNV(index, v.remaining() >> 2, memAddress(v));
    }

    /** Array version of: {@link #glVertex2hvNV Vertex2hvNV} */
    public static void glVertex2hvNV(short[] v) {
        long __functionAddress = GL.getICD().glVertex2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glVertex3hvNV Vertex3hvNV} */
    public static void glVertex3hvNV(short[] v) {
        long __functionAddress = GL.getICD().glVertex3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glVertex4hvNV Vertex4hvNV} */
    public static void glVertex4hvNV(short[] v) {
        long __functionAddress = GL.getICD().glVertex4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glNormal3hvNV Normal3hvNV} */
    public static void glNormal3hvNV(short[] v) {
        long __functionAddress = GL.getICD().glNormal3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glColor3hvNV Color3hvNV} */
    public static void glColor3hvNV(short[] v) {
        long __functionAddress = GL.getICD().glColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glColor4hvNV Color4hvNV} */
    public static void glColor4hvNV(short[] v) {
        long __functionAddress = GL.getICD().glColor4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glTexCoord1hvNV TexCoord1hvNV} */
    public static void glTexCoord1hvNV(short[] v) {
        long __functionAddress = GL.getICD().glTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glTexCoord2hvNV TexCoord2hvNV} */
    public static void glTexCoord2hvNV(short[] v) {
        long __functionAddress = GL.getICD().glTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glTexCoord3hvNV TexCoord3hvNV} */
    public static void glTexCoord3hvNV(short[] v) {
        long __functionAddress = GL.getICD().glTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glTexCoord4hvNV TexCoord4hvNV} */
    public static void glTexCoord4hvNV(short[] v) {
        long __functionAddress = GL.getICD().glTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glMultiTexCoord1hvNV MultiTexCoord1hvNV} */
    public static void glMultiTexCoord1hvNV(int target, short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, target, v);
    }

    /** Array version of: {@link #glMultiTexCoord2hvNV MultiTexCoord2hvNV} */
    public static void glMultiTexCoord2hvNV(int target, short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, target, v);
    }

    /** Array version of: {@link #glMultiTexCoord3hvNV MultiTexCoord3hvNV} */
    public static void glMultiTexCoord3hvNV(int target, short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, target, v);
    }

    /** Array version of: {@link #glMultiTexCoord4hvNV MultiTexCoord4hvNV} */
    public static void glMultiTexCoord4hvNV(int target, short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, target, v);
    }

    /** Array version of: {@link #glFogCoordhvNV FogCoordhvNV} */
    public static void glFogCoordhvNV(short[] fog) {
        long __functionAddress = GL.getICD().glFogCoordhvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(fog, 1);
        }
        callPV(__functionAddress, fog);
    }

    /** Array version of: {@link #glSecondaryColor3hvNV SecondaryColor3hvNV} */
    public static void glSecondaryColor3hvNV(short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, v);
    }

    /** Array version of: {@link #glVertexWeighthvNV VertexWeighthvNV} */
    public static void glVertexWeighthvNV(short[] weight) {
        long __functionAddress = GL.getICD().glVertexWeighthvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(weight, 1);
        }
        callPV(__functionAddress, weight);
    }

    /** Array version of: {@link #glVertexAttrib1hvNV VertexAttrib1hvNV} */
    public static void glVertexAttrib1hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, index, v);
    }

    /** Array version of: {@link #glVertexAttrib2hvNV VertexAttrib2hvNV} */
    public static void glVertexAttrib2hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, index, v);
    }

    /** Array version of: {@link #glVertexAttrib3hvNV VertexAttrib3hvNV} */
    public static void glVertexAttrib3hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, index, v);
    }

    /** Array version of: {@link #glVertexAttrib4hvNV VertexAttrib4hvNV} */
    public static void glVertexAttrib4hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4hvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /** Array version of: {@link #glVertexAttribs1hvNV VertexAttribs1hvNV} */
    public static void glVertexAttribs1hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs1hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, index, v.length, v);
    }

    /** Array version of: {@link #glVertexAttribs2hvNV VertexAttribs2hvNV} */
    public static void glVertexAttribs2hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs2hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, index, v.length >> 1, v);
    }

    /** Array version of: {@link #glVertexAttribs3hvNV VertexAttribs3hvNV} */
    public static void glVertexAttribs3hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs3hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, index, v.length / 3, v);
    }

    /** Array version of: {@link #glVertexAttribs4hvNV VertexAttribs4hvNV} */
    public static void glVertexAttribs4hvNV(int index, short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribs4hvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, index, v.length >> 2, v);
    }

}