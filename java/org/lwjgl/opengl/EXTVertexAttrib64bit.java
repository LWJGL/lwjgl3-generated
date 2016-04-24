/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/vertex_attrib_64bit.txt">EXT_vertex_attrib_64bit</a> extension.
 * 
 * <p>This extension provides OpenGL shading language support for vertex shader inputs with 64-bit floating-point components and OpenGL API support for
 * specifying the value of those inputs using vertex array or immediate mode entry points. This builds on the support for general-purpose support for
 * 64-bit floating-point values in the ARB_gpu_shader_fp64 extension.</p>
 * 
 * <p>This extension provides a new class of vertex attribute functions, beginning with "VertexAttribL" ("L" for "long"), that can be used to specify
 * attributes with 64-bit floating-point components. This extension provides no automatic type conversion between attribute and shader variables;
 * single-precision attributes are not automatically converted to double-precision or vice versa. For shader variables with 64-bit component types, the
 * "VertexAttribL" functions must be used to specify attribute values. For other shader variables, the "VertexAttribL" functions must not be used. If a
 * vertex attribute is specified using the wrong attribute function, the values of the corresponding shader input are undefined. This approach requiring
 * matching types is identical to that used for the "VertexAttribI" functions provided by OpenGL 3.0 and the EXT_gpu_shader4 extension.</p>
 * 
 * <p>Additionally, some vertex shader inputs using the wider 64-bit components may count double against the implementation-dependent limit on the number of
 * vertex shader attribute vectors. A 64-bit scalar or a two-component vector consumes only a single generic vertex attribute; three- and four-component
 * "long" may count as two. This approach is similar to the one used in the current GL where matrix attributes consume multiple attributes.</p>
 * 
 * <p>Note that 64-bit generic vertex attributes were nominally supported beginning with the introduction of vertex shaders in OpenGL 2.0. However, the
 * OpenGL Shading Language at the time had no support for 64-bit data types, so any such values were automatically converted to 32-bit.</p>
 * 
 * <p>Support for 64-bit floating-point vertex attributes in this extension can be combined with other extensions. In particular, this extension provides an
 * entry point that can be used with EXT_direct_state_access to directly set state for any vertex array object. Also, the related
 * NV_vertex_attrib_integer_64bit extension provides an entry point to specify bindless vertex attribute arrays with 64-bit components, integer or
 * floating-point.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} and {@link ARBGPUShaderFP64 ARB_gpu_shader_fp64} (or equivalent functionality).</p>
 */
public class EXTVertexAttrib64bit {

	/** Returned in the {@code type} parameter of GetActiveAttrib. */
	public static final int
		GL_DOUBLE_VEC2_EXT   = 0x8FFC,
		GL_DOUBLE_VEC3_EXT   = 0x8FFD,
		GL_DOUBLE_VEC4_EXT   = 0x8FFE,
		GL_DOUBLE_MAT2_EXT   = 0x8F46,
		GL_DOUBLE_MAT3_EXT   = 0x8F47,
		GL_DOUBLE_MAT4_EXT   = 0x8F48,
		GL_DOUBLE_MAT2x3_EXT = 0x8F49,
		GL_DOUBLE_MAT2x4_EXT = 0x8F4A,
		GL_DOUBLE_MAT3x2_EXT = 0x8F4B,
		GL_DOUBLE_MAT3x4_EXT = 0x8F4C,
		GL_DOUBLE_MAT4x2_EXT = 0x8F4D,
		GL_DOUBLE_MAT4x3_EXT = 0x8F4E;

	protected EXTVertexAttrib64bit() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glVertexAttribL1dEXT, caps.glVertexAttribL2dEXT, caps.glVertexAttribL3dEXT, caps.glVertexAttribL4dEXT, caps.glVertexAttribL1dvEXT, 
			caps.glVertexAttribL2dvEXT, caps.glVertexAttribL3dvEXT, caps.glVertexAttribL4dvEXT, caps.glVertexAttribLPointerEXT, caps.glGetVertexAttribLdvEXT, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribLOffsetEXT : -1L
		);
	}

	// --- [ glVertexAttribL1dEXT ] ---

	public static void glVertexAttribL1dEXT(int index, double x) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1dEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribL2dEXT ] ---

	public static void glVertexAttribL2dEXT(int index, double x, double y) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2dEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribL3dEXT ] ---

	public static void glVertexAttribL3dEXT(int index, double x, double y, double z) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3dEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribL4dEXT ] ---

	public static void glVertexAttribL4dEXT(int index, double x, double y, double z, double w) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4dEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribL1dvEXT ] ---

	public static void nglVertexAttribL1dvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL1dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL1dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL2dvEXT ] ---

	public static void nglVertexAttribL2dvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL2dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL2dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL3dvEXT ] ---

	public static void nglVertexAttribL3dvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL3dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL3dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL4dvEXT ] ---

	public static void nglVertexAttribL4dvEXT(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	public static void glVertexAttribL4dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL4dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribLPointerEXT ] ---

	public static void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribLPointerEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	public static void glVertexAttribLPointerEXT(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	public static void glVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribLPointerEXT(index, size, type, stride, pointer);
	}

	public static void glVertexAttribLPointerEXT(int index, int size, int stride, DoubleBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointerEXT(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribLdvEXT ] ---

	public static void nglGetVertexAttribLdvEXT(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLdvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	public static void glGetVertexAttribLdvEXT(int index, int pname, DoubleBuffer params) {
		nglGetVertexAttribLdvEXT(index, pname, memAddress(params));
	}

	// --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

	public static void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexAttribLOffsetEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, buffer, index, size, type, stride, offset);
	}

	/** Array version of: {@link #glVertexAttribL1dvEXT VertexAttribL1dvEXT} */
	public static void glVertexAttribL1dvEXT(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL2dvEXT VertexAttribL2dvEXT} */
	public static void glVertexAttribL2dvEXT(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL3dvEXT VertexAttribL3dvEXT} */
	public static void glVertexAttribL3dvEXT(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL4dvEXT VertexAttribL4dvEXT} */
	public static void glVertexAttribL4dvEXT(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4dvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glGetVertexAttribLdvEXT GetVertexAttribLdvEXT} */
	public static void glGetVertexAttribLdvEXT(int index, int pname, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLdvEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

}