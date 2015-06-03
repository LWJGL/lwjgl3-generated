/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/EXT/bindable_uniform.txt">EXT_bindable_uniform</a> extension.
 * 
 * <p>This extension introduces the concept of bindable uniforms to the OpenGL Shading Language. A uniform variable can be declared bindable, which means that
 * the storage for the uniform is not allocated by the compiler/linker anymore, but is backed by a buffer object. This buffer object is bound to the
 * bindable uniform through the new command UniformBufferEXT(). Binding needs to happen after linking a program object.</p>
 * 
 * <p>Binding different buffer objects to a bindable uniform allows an application to easily use different "uniform data sets", without having to re-specify
 * the data every time.</p>
 * 
 * <p>A buffer object can be bound to bindable uniforms in different program objects. If those bindable uniforms are all of the same type, accessing a
 * bindable uniform in program object A will result in the same data if the same access is made in program object B. This provides a mechanism for
 * 'environment uniforms', uniform values that can be shared among multiple program objects.</p>
 */
public final class EXTBindableUniform {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT   = 0x8DE2,
		GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3,
		GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4,
		GL_MAX_BINDABLE_UNIFORM_SIZE_EXT      = 0x8DED,
		GL_UNIFORM_BUFFER_BINDING_EXT         = 0x8DEF;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;

	/** Function address. */
	@JavadocExclude
	public final long
		UniformBufferEXT,
		GetUniformBufferSizeEXT,
		GetUniformOffsetEXT;

	@JavadocExclude
	public EXTBindableUniform(FunctionProvider provider) {
		UniformBufferEXT = provider.getFunctionAddress("glUniformBufferEXT");
		GetUniformBufferSizeEXT = provider.getFunctionAddress("glGetUniformBufferSizeEXT");
		GetUniformOffsetEXT = provider.getFunctionAddress("glGetUniformOffsetEXT");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link EXTBindableUniform} instance for the current context. */
	public static EXTBindableUniform getInstance() {
		return checkFunctionality(GL.getCapabilities().__EXTBindableUniform);
	}

	static EXTBindableUniform create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_EXT_bindable_uniform") ) return null;

		EXTBindableUniform funcs = new EXTBindableUniform(provider);

		boolean supported = checkFunctions(
			funcs.UniformBufferEXT, funcs.GetUniformBufferSizeEXT, funcs.GetUniformOffsetEXT
		);

		return GL.checkExtension("GL_EXT_bindable_uniform", funcs, supported);
	}

	// --- [ glUniformBufferEXT ] ---

	/** JNI method for {@link #glUniformBufferEXT UniformBufferEXT} */
	@JavadocExclude
	public static native void nglUniformBufferEXT(int program, int location, int buffer, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 * @param buffer   
	 */
	public static void glUniformBufferEXT(int program, int location, int buffer) {
		long __functionAddress = getInstance().UniformBufferEXT;
		nglUniformBufferEXT(program, location, buffer, __functionAddress);
	}

	// --- [ glGetUniformBufferSizeEXT ] ---

	/** JNI method for {@link #glGetUniformBufferSizeEXT GetUniformBufferSizeEXT} */
	@JavadocExclude
	public static native int nglGetUniformBufferSizeEXT(int program, int location, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 */
	public static int glGetUniformBufferSizeEXT(int program, int location) {
		long __functionAddress = getInstance().GetUniformBufferSizeEXT;
		return nglGetUniformBufferSizeEXT(program, location, __functionAddress);
	}

	// --- [ glGetUniformOffsetEXT ] ---

	/** JNI method for {@link #glGetUniformOffsetEXT GetUniformOffsetEXT} */
	@JavadocExclude
	public static native long nglGetUniformOffsetEXT(int program, int location, long __functionAddress);

	/**
	 * 
	 *
	 * @param program  
	 * @param location 
	 */
	public static long glGetUniformOffsetEXT(int program, int location) {
		long __functionAddress = getInstance().GetUniformOffsetEXT;
		return nglGetUniformOffsetEXT(program, location, __functionAddress);
	}

}