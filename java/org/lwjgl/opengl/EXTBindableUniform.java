/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

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
public class EXTBindableUniform {

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
	public static final int
		GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT   = 0x8DE2,
		GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 0x8DE3,
		GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 0x8DE4,
		GL_MAX_BINDABLE_UNIFORM_SIZE_EXT      = 0x8DED,
		GL_UNIFORM_BUFFER_BINDING_EXT         = 0x8DEF;

	/** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
	public static final int GL_UNIFORM_BUFFER_EXT = 0x8DEE;

	protected EXTBindableUniform() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glUniformBufferEXT, caps.glGetUniformBufferSizeEXT, caps.glGetUniformOffsetEXT
		);
	}

	// --- [ glUniformBufferEXT ] ---

	public static void glUniformBufferEXT(int program, int location, int buffer) {
		long __functionAddress = GL.getCapabilities().glUniformBufferEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, program, location, buffer);
	}

	// --- [ glGetUniformBufferSizeEXT ] ---

	public static int glGetUniformBufferSizeEXT(int program, int location) {
		long __functionAddress = GL.getCapabilities().glGetUniformBufferSizeEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callI(__functionAddress, program, location);
	}

	// --- [ glGetUniformOffsetEXT ] ---

	public static long glGetUniformOffsetEXT(int program, int location) {
		long __functionAddress = GL.getCapabilities().glGetUniformOffsetEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callP(__functionAddress, program, location);
	}

}