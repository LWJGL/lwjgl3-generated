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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/vertex_attrib_64bit.txt">ARB_vertex_attrib_64bit</a> extension.
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
 * matching types is identical to that used for the "VertexAttribI" functions provided by OpenGL 3.0 and the <a href="http://www.opengl.org/registry/specs/EXT/gpu_shader4.txt">EXT_gpu_shader4</a>
 * extension.</p>
 * 
 * <p>Additionally, some vertex shader inputs using the wider 64-bit components may count double against the implementation-dependent limit on the number of
 * vertex shader attribute vectors. A 64-bit scalar or a two-component vector consumes only a single generic vertex attribute; three- and four-component
 * "long" may count as two. This approach is similar to the one used in the current GL where matrix attributes consume multiple attributes.</p>
 * 
 * <p>Note that 64-bit generic vertex attributes were nominally supported beginning with the introduction of vertex shaders in OpenGL 2.0. However, the OpenGL
 * Shading Language at the time had no support for 64-bit data types, so any such values were automatically converted to 32-bit.</p>
 * 
 * <p>Support for 64-bit floating-point vertex attributes in this extension can be combined with other extensions. In particular, this extension provides an
 * entry point that can be used with EXT_direct_state_access to directly set state for any vertex array object. Also, the related
 * <a href="http://www.opengl.org/registry/specs/NV/vertex_attrib_integer_64bit.txt">NV_vertex_attrib_integer_64bit</a> extension provides an entry point to specify bindless vertex attribute arrays with 64-bit
 * components, integer or floating-point.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}, GLSL 1.30 and {@link ARBGPUShaderFP64 ARB_gpu_shader_fp64}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBVertexAttrib64Bit {

	/** Returned in the {@code type} parameter of GetActiveAttrib. */
	public static final int
		GL_DOUBLE_VEC2   = 0x8FFC,
		GL_DOUBLE_VEC3   = 0x8FFD,
		GL_DOUBLE_VEC4   = 0x8FFE,
		GL_DOUBLE_MAT2   = 0x8F46,
		GL_DOUBLE_MAT3   = 0x8F47,
		GL_DOUBLE_MAT4   = 0x8F48,
		GL_DOUBLE_MAT2x3 = 0x8F49,
		GL_DOUBLE_MAT2x4 = 0x8F4A,
		GL_DOUBLE_MAT3x2 = 0x8F4B,
		GL_DOUBLE_MAT3x4 = 0x8F4C,
		GL_DOUBLE_MAT4x2 = 0x8F4D,
		GL_DOUBLE_MAT4x3 = 0x8F4E;

	protected ARBVertexAttrib64Bit() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps, java.util.Set<String> ext) {
		return checkFunctions(
			caps.glVertexAttribL1d, caps.glVertexAttribL2d, caps.glVertexAttribL3d, caps.glVertexAttribL4d, caps.glVertexAttribL1dv, caps.glVertexAttribL2dv, 
			caps.glVertexAttribL3dv, caps.glVertexAttribL4dv, caps.glVertexAttribLPointer, caps.glGetVertexAttribLdv, 
			ext.contains("GL_EXT_direct_state_access") ? caps.glVertexArrayVertexAttribLOffsetEXT : -1L
		);
	}

	// --- [ glVertexAttribL1d ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0 and w to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 */
	public static void glVertexAttribL1d(int index, double x) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribL2d ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0 and w to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 */
	public static void glVertexAttribL2d(int index, double x, double y) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y);
	}

	// --- [ glVertexAttribL3d ] ---

	/**
	 * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 */
	public static void glVertexAttribL3d(int index, double x, double y, double z) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z);
	}

	// --- [ glVertexAttribL4d ] ---

	/**
	 * Specifies the value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the vertex attribute x component
	 * @param y     the vertex attribute y component
	 * @param z     the vertex attribute z component
	 * @param w     the vertex attribute w component
	 */
	public static void glVertexAttribL4d(int index, double x, double y, double z, double w) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4d;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, index, x, y, z, w);
	}

	// --- [ glVertexAttribL1dv ] ---

	/**
	 * Pointer version of {@link #glVertexAttribL1d VertexAttribL1d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttribL1dv(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribL1d VertexAttribL1d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL1dv(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 1);
		nglVertexAttribL1dv(index, memAddress(v));
	}

	// --- [ glVertexAttribL2dv ] ---

	/**
	 * Pointer version of {@link #glVertexAttribL2d VertexAttribL2d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttribL2dv(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribL2d VertexAttribL2d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL2dv(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 2);
		nglVertexAttribL2dv(index, memAddress(v));
	}

	// --- [ glVertexAttribL3dv ] ---

	/**
	 * Pointer version of {@link #glVertexAttribL3d VertexAttribL3d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttribL3dv(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribL3d VertexAttribL3d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL3dv(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 3);
		nglVertexAttribL3dv(index, memAddress(v));
	}

	// --- [ glVertexAttribL4dv ] ---

	/**
	 * Pointer version of {@link #glVertexAttribL4d VertexAttribL4d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttribL4dv(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4dv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribL4d VertexAttribL4d}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL4dv(int index, DoubleBuffer v) {
		if ( CHECKS )
			checkBuffer(v, 4);
		nglVertexAttribL4dv(index, memAddress(v));
	}

	// --- [ glVertexAttribLPointer ] ---

	/**
	 * Specifies the location and organization of a 64-bit vertex attribute array.
	 *
	 * @param index   the index of the generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = GL.getCapabilities().glVertexAttribLPointer;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a 64-bit vertex attribute array.
	 *
	 * @param index   the index of the generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribLPointer(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointer(index, size, type, stride, memAddress(pointer));
	}

	/**
	 * Specifies the location and organization of a 64-bit vertex attribute array.
	 *
	 * @param index   the index of the generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type    the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribLPointer(index, size, type, stride, pointer);
	}

	/**
	 * Specifies the location and organization of a 64-bit vertex attribute array.
	 *
	 * @param index   the index of the generic vertex attribute to be modified
	 * @param size    the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param stride  the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *                the array. The initial value is 0.
	 * @param pointer the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
	 *                currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
	 */
	public static void glVertexAttribLPointer(int index, int size, int stride, DoubleBuffer pointer) {
		if ( CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointer(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribLdv ] ---

	/**
	 * Double version of {@link GL20#glGetVertexAttribi GetVertexAttribi}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params the requested data
	 */
	public static void nglGetVertexAttribLdv(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Double version of {@link GL20#glGetVertexAttribi GetVertexAttribi}.
	 *
	 * @param index  the generic vertex attribute parameter to be queried
	 * @param pname  the symbolic name of the vertex attribute parameter to be queried
	 * @param params the requested data
	 */
	public static void glGetVertexAttribLdv(int index, int pname, DoubleBuffer params) {
		nglGetVertexAttribLdv(index, pname, memAddress(params));
	}

	// --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

	/**
	 * DSA version of {@link #glVertexAttribLPointer VertexAttribLPointer}.
	 *
	 * @param vaobj  the vertex array object
	 * @param buffer the buffer object
	 * @param index  the index of the generic vertex attribute to be modified
	 * @param size   the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
	 * @param type   the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
	 * @param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
	 *               the array. The initial value is 0.
	 * @param offset the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer. The initial value is 0.
	 */
	public static void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
		long __functionAddress = GL.getCapabilities().glVertexArrayVertexAttribLOffsetEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, vaobj, buffer, index, size, type, stride, offset);
	}

	/** Array version of: {@link #glVertexAttribL1dv VertexAttribL1dv} */
	public static void glVertexAttribL1dv(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 1);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL2dv VertexAttribL2dv} */
	public static void glVertexAttribL2dv(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL2dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 2);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL3dv VertexAttribL3dv} */
	public static void glVertexAttribL3dv(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL3dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 3);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glVertexAttribL4dv VertexAttribL4dv} */
	public static void glVertexAttribL4dv(int index, double[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL4dv;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(v, 4);
		}
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glGetVertexAttribLdv GetVertexAttribLdv} */
	public static void glGetVertexAttribLdv(int index, int pname, double[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLdv;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

}