/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
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
public final class EXTVertexAttrib64bit {

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

	/** Function address. */
	@JavadocExclude
	public final long
		VertexAttribL1dEXT,
		VertexAttribL2dEXT,
		VertexAttribL3dEXT,
		VertexAttribL4dEXT,
		VertexAttribL1dvEXT,
		VertexAttribL2dvEXT,
		VertexAttribL3dvEXT,
		VertexAttribL4dvEXT,
		VertexAttribLPointerEXT,
		GetVertexAttribLdvEXT,
		VertexArrayVertexAttribLOffsetEXT;

	@JavadocExclude
	public EXTVertexAttrib64bit(FunctionProvider provider) {
		VertexAttribL1dEXT = provider.getFunctionAddress("glVertexAttribL1dEXT");
		VertexAttribL2dEXT = provider.getFunctionAddress("glVertexAttribL2dEXT");
		VertexAttribL3dEXT = provider.getFunctionAddress("glVertexAttribL3dEXT");
		VertexAttribL4dEXT = provider.getFunctionAddress("glVertexAttribL4dEXT");
		VertexAttribL1dvEXT = provider.getFunctionAddress("glVertexAttribL1dvEXT");
		VertexAttribL2dvEXT = provider.getFunctionAddress("glVertexAttribL2dvEXT");
		VertexAttribL3dvEXT = provider.getFunctionAddress("glVertexAttribL3dvEXT");
		VertexAttribL4dvEXT = provider.getFunctionAddress("glVertexAttribL4dvEXT");
		VertexAttribLPointerEXT = provider.getFunctionAddress("glVertexAttribLPointerEXT");
		GetVertexAttribLdvEXT = provider.getFunctionAddress("glGetVertexAttribLdvEXT");
		VertexArrayVertexAttribLOffsetEXT = provider.getFunctionAddress("glVertexArrayVertexAttribLOffsetEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTVertexAttrib64bit} instance for the current context. */
	public static EXTVertexAttrib64bit getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTVertexAttrib64bit);
	}

	static EXTVertexAttrib64bit create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_vertex_attrib_64bit") ) return null;

		EXTVertexAttrib64bit funcs = new EXTVertexAttrib64bit(provider);

		boolean supported = checkFunctions(
			funcs.VertexAttribL1dEXT, funcs.VertexAttribL2dEXT, funcs.VertexAttribL3dEXT, funcs.VertexAttribL4dEXT, funcs.VertexAttribL1dvEXT, 
			funcs.VertexAttribL2dvEXT, funcs.VertexAttribL3dvEXT, funcs.VertexAttribL4dvEXT, funcs.VertexAttribLPointerEXT, funcs.GetVertexAttribLdvEXT, 
			ext.contains("GL_EXT_direct_state_access") ? funcs.VertexArrayVertexAttribLOffsetEXT : -1L
		);

		return GL.checkExtension("GL_EXT_vertex_attrib_64bit", funcs, supported);
	}

	// --- [ glVertexAttribL1dEXT ] ---

	/** JNI method for {@link #glVertexAttribL1dEXT VertexAttribL1dEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL1dEXT(int index, double x, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 */
	public static void glVertexAttribL1dEXT(int index, double x) {
		long __functionAddress = getInstance().VertexAttribL1dEXT;
		nglVertexAttribL1dEXT(index, x, __functionAddress);
	}

	// --- [ glVertexAttribL2dEXT ] ---

	/** JNI method for {@link #glVertexAttribL2dEXT VertexAttribL2dEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL2dEXT(int index, double x, double y, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 */
	public static void glVertexAttribL2dEXT(int index, double x, double y) {
		long __functionAddress = getInstance().VertexAttribL2dEXT;
		nglVertexAttribL2dEXT(index, x, y, __functionAddress);
	}

	// --- [ glVertexAttribL3dEXT ] ---

	/** JNI method for {@link #glVertexAttribL3dEXT VertexAttribL3dEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL3dEXT(int index, double x, double y, double z, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 * @param z     
	 */
	public static void glVertexAttribL3dEXT(int index, double x, double y, double z) {
		long __functionAddress = getInstance().VertexAttribL3dEXT;
		nglVertexAttribL3dEXT(index, x, y, z, __functionAddress);
	}

	// --- [ glVertexAttribL4dEXT ] ---

	/** JNI method for {@link #glVertexAttribL4dEXT VertexAttribL4dEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL4dEXT(int index, double x, double y, double z, double w, long __functionAddress);

	/**
	 * 
	 *
	 * @param index 
	 * @param x     
	 * @param y     
	 * @param z     
	 * @param w     
	 */
	public static void glVertexAttribL4dEXT(int index, double x, double y, double z, double w) {
		long __functionAddress = getInstance().VertexAttribL4dEXT;
		nglVertexAttribL4dEXT(index, x, y, z, w, __functionAddress);
	}

	// --- [ glVertexAttribL1dvEXT ] ---

	/** JNI method for {@link #glVertexAttribL1dvEXT VertexAttribL1dvEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL1dvEXT(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribL1dvEXT VertexAttribL1dvEXT} */
	@JavadocExclude
	public static void nglVertexAttribL1dvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL1dvEXT;
		nglVertexAttribL1dvEXT(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
	public static void glVertexAttribL1dvEXT(int index, ByteBuffer v) {
		nglVertexAttribL1dvEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL1dvEXT VertexAttribL1dvEXT} */
	public static void glVertexAttribL1dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL1dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL2dvEXT ] ---

	/** JNI method for {@link #glVertexAttribL2dvEXT VertexAttribL2dvEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL2dvEXT(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribL2dvEXT VertexAttribL2dvEXT} */
	@JavadocExclude
	public static void nglVertexAttribL2dvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL2dvEXT;
		nglVertexAttribL2dvEXT(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
	public static void glVertexAttribL2dvEXT(int index, ByteBuffer v) {
		nglVertexAttribL2dvEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL2dvEXT VertexAttribL2dvEXT} */
	public static void glVertexAttribL2dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL2dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL3dvEXT ] ---

	/** JNI method for {@link #glVertexAttribL3dvEXT VertexAttribL3dvEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL3dvEXT(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribL3dvEXT VertexAttribL3dvEXT} */
	@JavadocExclude
	public static void nglVertexAttribL3dvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL3dvEXT;
		nglVertexAttribL3dvEXT(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
	public static void glVertexAttribL3dvEXT(int index, ByteBuffer v) {
		nglVertexAttribL3dvEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL3dvEXT VertexAttribL3dvEXT} */
	public static void glVertexAttribL3dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL3dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribL4dvEXT ] ---

	/** JNI method for {@link #glVertexAttribL4dvEXT VertexAttribL4dvEXT} */
	@JavadocExclude
	public static native void nglVertexAttribL4dvEXT(int index, long v, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribL4dvEXT VertexAttribL4dvEXT} */
	@JavadocExclude
	public static void nglVertexAttribL4dvEXT(int index, long v) {
		long __functionAddress = getInstance().VertexAttribL4dvEXT;
		nglVertexAttribL4dvEXT(index, v, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index 
	 * @param v     
	 */
	public static void glVertexAttribL4dvEXT(int index, ByteBuffer v) {
		nglVertexAttribL4dvEXT(index, memAddress(v));
	}

	/** Alternative version of: {@link #glVertexAttribL4dvEXT VertexAttribL4dvEXT} */
	public static void glVertexAttribL4dvEXT(int index, DoubleBuffer v) {
		nglVertexAttribL4dvEXT(index, memAddress(v));
	}

	// --- [ glVertexAttribLPointerEXT ] ---

	/** JNI method for {@link #glVertexAttribLPointerEXT VertexAttribLPointerEXT} */
	@JavadocExclude
	public static native void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer, long __functionAddress);

	/** Unsafe version of {@link #glVertexAttribLPointerEXT VertexAttribLPointerEXT} */
	@JavadocExclude
	public static void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer) {
		long __functionAddress = getInstance().VertexAttribLPointerEXT;
		nglVertexAttribLPointerEXT(index, size, type, stride, pointer, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index   
	 * @param size    
	 * @param type    
	 * @param stride  
	 * @param pointer 
	 */
	public static void glVertexAttribLPointerEXT(int index, int size, int type, int stride, ByteBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointerEXT(index, size, type, stride, memAddress(pointer));
	}

	/** Buffer object offset version of: {@link #glVertexAttribLPointerEXT VertexAttribLPointerEXT} */
	public static void glVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointerOffset) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, true);
		nglVertexAttribLPointerEXT(index, size, type, stride, pointerOffset);
	}

	/** GL_DOUBLE version of: {@link #glVertexAttribLPointerEXT VertexAttribLPointerEXT} */
	public static void glVertexAttribLPointerEXT(int index, int size, int stride, DoubleBuffer pointer) {
		if ( LWJGLUtil.CHECKS )
			GLChecks.ensureBufferObject(GL15.GL_ARRAY_BUFFER_BINDING, false);
		nglVertexAttribLPointerEXT(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
	}

	// --- [ glGetVertexAttribLdvEXT ] ---

	/** JNI method for {@link #glGetVertexAttribLdvEXT GetVertexAttribLdvEXT} */
	@JavadocExclude
	public static native void nglGetVertexAttribLdvEXT(int index, int pname, long params, long __functionAddress);

	/** Unsafe version of {@link #glGetVertexAttribLdvEXT GetVertexAttribLdvEXT} */
	@JavadocExclude
	public static void nglGetVertexAttribLdvEXT(int index, int pname, long params) {
		long __functionAddress = getInstance().GetVertexAttribLdvEXT;
		nglGetVertexAttribLdvEXT(index, pname, params, __functionAddress);
	}

	/**
	 * 
	 *
	 * @param index  
	 * @param pname  
	 * @param params 
	 */
	public static void glGetVertexAttribLdvEXT(int index, int pname, ByteBuffer params) {
		nglGetVertexAttribLdvEXT(index, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetVertexAttribLdvEXT GetVertexAttribLdvEXT} */
	public static void glGetVertexAttribLdvEXT(int index, int pname, DoubleBuffer params) {
		nglGetVertexAttribLdvEXT(index, pname, memAddress(params));
	}

	// --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

	/** JNI method for {@link #glVertexArrayVertexAttribLOffsetEXT VertexArrayVertexAttribLOffsetEXT} */
	@JavadocExclude
	public static native void nglVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset, long __functionAddress);

	/**
	 * 
	 *
	 * @param vaobj  
	 * @param buffer 
	 * @param index  
	 * @param size   
	 * @param type   
	 * @param stride 
	 * @param offset 
	 */
	public static void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
		long __functionAddress = getInstance().VertexArrayVertexAttribLOffsetEXT;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nglVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, offset, __functionAddress);
	}

}