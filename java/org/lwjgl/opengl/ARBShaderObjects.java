/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/shader_objects.txt">ARB_shader_objects</a> extension.
 * 
 * <p>This extension adds API calls that are necessary to manage shader objects and program objects as defined in the OpenGL 2.0 white papers by 3Dlabs.</p>
 * 
 * <p>The generation of an executable that runs on one of OpenGL's programmable units is modeled to that of developing a typical C/C++ application. There are
 * one or more source files, each of which are stored by OpenGL in a shader object. Each shader object (source file) needs to be compiled and attached to a
 * program object. Once all shader objects are compiled successfully, the program object needs to be linked to produce an executable. This executable is
 * part of the program object, and can now be loaded onto the programmable units to make it part of the current OpenGL state. Both the compile and link
 * stages generate a text string that can be queried to get more information. This information could be, but is not limited to, compile errors, link errors,
 * optimization hints, etc. Values for uniform variables, declared in a shader, can be set by the application and used to control a shader's behavior.</p>
 * 
 * <p>This extension defines functions for creating shader objects and program objects, for compiling shader objects, for linking program objects, for
 * attaching shader objects to program objects, and for using a program object as part of current state. Functions to load uniform values are also defined.
 * Some house keeping functions, like deleting an object and querying object state, are also provided.</p>
 * 
 * <p>Although this extension defines the API for creating shader objects, it does not define any specific types of shader objects. It is assumed that this
 * extension will be implemented along with at least one such additional extension for creating a specific type of OpenGL 2.0 shader (e.g., the
 * {@link ARBFragmentShader ARB_fragment_shader} extension or the {@link ARBVertexShader ARB_vertex_shader} extension).</p>
 * 
 * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public class ARBShaderObjects {

	/** Accepted by the {@code pname} argument of GetHandleARB. */
	public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;

	/** Accepted by the {@code pname} parameter of GetObjectParameter{fi}vARB. */
	public static final int
		GL_OBJECT_TYPE_ARB                      = 0x8B4E,
		GL_OBJECT_SUBTYPE_ARB                   = 0x8B4F,
		GL_OBJECT_DELETE_STATUS_ARB             = 0x8B80,
		GL_OBJECT_COMPILE_STATUS_ARB            = 0x8B81,
		GL_OBJECT_LINK_STATUS_ARB               = 0x8B82,
		GL_OBJECT_VALIDATE_STATUS_ARB           = 0x8B83,
		GL_OBJECT_INFO_LOG_LENGTH_ARB           = 0x8B84,
		GL_OBJECT_ATTACHED_OBJECTS_ARB          = 0x8B85,
		GL_OBJECT_ACTIVE_UNIFORMS_ARB           = 0x8B86,
		GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87,
		GL_OBJECT_SHADER_SOURCE_LENGTH_ARB      = 0x8B88;

	/** Returned by the {@code params} parameter of GetObjectParameter{fi}vARB. */
	public static final int GL_SHADER_OBJECT_ARB = 0x8B48;

	/** Returned by the {@code type} parameter of GetActiveUniformARB. */
	public static final int
		GL_FLOAT_VEC2_ARB             = 0x8B50,
		GL_FLOAT_VEC3_ARB             = 0x8B51,
		GL_FLOAT_VEC4_ARB             = 0x8B52,
		GL_INT_VEC2_ARB               = 0x8B53,
		GL_INT_VEC3_ARB               = 0x8B54,
		GL_INT_VEC4_ARB               = 0x8B55,
		GL_BOOL_ARB                   = 0x8B56,
		GL_BOOL_VEC2_ARB              = 0x8B57,
		GL_BOOL_VEC3_ARB              = 0x8B58,
		GL_BOOL_VEC4_ARB              = 0x8B59,
		GL_FLOAT_MAT2_ARB             = 0x8B5A,
		GL_FLOAT_MAT3_ARB             = 0x8B5B,
		GL_FLOAT_MAT4_ARB             = 0x8B5C,
		GL_SAMPLER_1D_ARB             = 0x8B5D,
		GL_SAMPLER_2D_ARB             = 0x8B5E,
		GL_SAMPLER_3D_ARB             = 0x8B5F,
		GL_SAMPLER_CUBE_ARB           = 0x8B60,
		GL_SAMPLER_1D_SHADOW_ARB      = 0x8B61,
		GL_SAMPLER_2D_SHADOW_ARB      = 0x8B62,
		GL_SAMPLER_2D_RECT_ARB        = 0x8B63,
		GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;

	/** Function address. */
	public final long
		DeleteObjectARB,
		GetHandleARB,
		DetachObjectARB,
		CreateShaderObjectARB,
		ShaderSourceARB,
		CompileShaderARB,
		CreateProgramObjectARB,
		AttachObjectARB,
		LinkProgramARB,
		UseProgramObjectARB,
		ValidateProgramARB,
		Uniform1fARB,
		Uniform2fARB,
		Uniform3fARB,
		Uniform4fARB,
		Uniform1iARB,
		Uniform2iARB,
		Uniform3iARB,
		Uniform4iARB,
		Uniform1fvARB,
		Uniform2fvARB,
		Uniform3fvARB,
		Uniform4fvARB,
		Uniform1ivARB,
		Uniform2ivARB,
		Uniform3ivARB,
		Uniform4ivARB,
		UniformMatrix2fvARB,
		UniformMatrix3fvARB,
		UniformMatrix4fvARB,
		GetObjectParameterfvARB,
		GetObjectParameterivARB,
		GetInfoLogARB,
		GetAttachedObjectsARB,
		GetUniformLocationARB,
		GetActiveUniformARB,
		GetUniformfvARB,
		GetUniformivARB,
		GetShaderSourceARB;

	protected ARBShaderObjects() {
		throw new UnsupportedOperationException();
	}

	public ARBShaderObjects(FunctionProvider provider) {
		DeleteObjectARB = provider.getFunctionAddress("glDeleteObjectARB");
		GetHandleARB = provider.getFunctionAddress("glGetHandleARB");
		DetachObjectARB = provider.getFunctionAddress("glDetachObjectARB");
		CreateShaderObjectARB = provider.getFunctionAddress("glCreateShaderObjectARB");
		ShaderSourceARB = provider.getFunctionAddress("glShaderSourceARB");
		CompileShaderARB = provider.getFunctionAddress("glCompileShaderARB");
		CreateProgramObjectARB = provider.getFunctionAddress("glCreateProgramObjectARB");
		AttachObjectARB = provider.getFunctionAddress("glAttachObjectARB");
		LinkProgramARB = provider.getFunctionAddress("glLinkProgramARB");
		UseProgramObjectARB = provider.getFunctionAddress("glUseProgramObjectARB");
		ValidateProgramARB = provider.getFunctionAddress("glValidateProgramARB");
		Uniform1fARB = provider.getFunctionAddress("glUniform1fARB");
		Uniform2fARB = provider.getFunctionAddress("glUniform2fARB");
		Uniform3fARB = provider.getFunctionAddress("glUniform3fARB");
		Uniform4fARB = provider.getFunctionAddress("glUniform4fARB");
		Uniform1iARB = provider.getFunctionAddress("glUniform1iARB");
		Uniform2iARB = provider.getFunctionAddress("glUniform2iARB");
		Uniform3iARB = provider.getFunctionAddress("glUniform3iARB");
		Uniform4iARB = provider.getFunctionAddress("glUniform4iARB");
		Uniform1fvARB = provider.getFunctionAddress("glUniform1fvARB");
		Uniform2fvARB = provider.getFunctionAddress("glUniform2fvARB");
		Uniform3fvARB = provider.getFunctionAddress("glUniform3fvARB");
		Uniform4fvARB = provider.getFunctionAddress("glUniform4fvARB");
		Uniform1ivARB = provider.getFunctionAddress("glUniform1ivARB");
		Uniform2ivARB = provider.getFunctionAddress("glUniform2ivARB");
		Uniform3ivARB = provider.getFunctionAddress("glUniform3ivARB");
		Uniform4ivARB = provider.getFunctionAddress("glUniform4ivARB");
		UniformMatrix2fvARB = provider.getFunctionAddress("glUniformMatrix2fvARB");
		UniformMatrix3fvARB = provider.getFunctionAddress("glUniformMatrix3fvARB");
		UniformMatrix4fvARB = provider.getFunctionAddress("glUniformMatrix4fvARB");
		GetObjectParameterfvARB = provider.getFunctionAddress("glGetObjectParameterfvARB");
		GetObjectParameterivARB = provider.getFunctionAddress("glGetObjectParameterivARB");
		GetInfoLogARB = provider.getFunctionAddress("glGetInfoLogARB");
		GetAttachedObjectsARB = provider.getFunctionAddress("glGetAttachedObjectsARB");
		GetUniformLocationARB = provider.getFunctionAddress("glGetUniformLocationARB");
		GetActiveUniformARB = provider.getFunctionAddress("glGetActiveUniformARB");
		GetUniformfvARB = provider.getFunctionAddress("glGetUniformfvARB");
		GetUniformivARB = provider.getFunctionAddress("glGetUniformivARB");
		GetShaderSourceARB = provider.getFunctionAddress("glGetShaderSourceARB");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link ARBShaderObjects} instance of the current context. */
	public static ARBShaderObjects getInstance() {
		return getInstance(GL.getCapabilities());
	}

	/** Returns the {@link ARBShaderObjects} instance of the specified {@link GLCapabilities}. */
	public static ARBShaderObjects getInstance(GLCapabilities caps) {
		return checkFunctionality(caps.__ARBShaderObjects);
	}

	static ARBShaderObjects create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_ARB_shader_objects") ) return null;

		ARBShaderObjects funcs = new ARBShaderObjects(provider);

		boolean supported = checkFunctions(
			funcs.DeleteObjectARB, funcs.GetHandleARB, funcs.DetachObjectARB, funcs.CreateShaderObjectARB, funcs.ShaderSourceARB, funcs.CompileShaderARB, 
			funcs.CreateProgramObjectARB, funcs.AttachObjectARB, funcs.LinkProgramARB, funcs.UseProgramObjectARB, funcs.ValidateProgramARB, funcs.Uniform1fARB, 
			funcs.Uniform2fARB, funcs.Uniform3fARB, funcs.Uniform4fARB, funcs.Uniform1iARB, funcs.Uniform2iARB, funcs.Uniform3iARB, funcs.Uniform4iARB, 
			funcs.Uniform1fvARB, funcs.Uniform2fvARB, funcs.Uniform3fvARB, funcs.Uniform4fvARB, funcs.Uniform1ivARB, funcs.Uniform2ivARB, funcs.Uniform3ivARB, 
			funcs.Uniform4ivARB, funcs.UniformMatrix2fvARB, funcs.UniformMatrix3fvARB, funcs.UniformMatrix4fvARB, funcs.GetObjectParameterfvARB, 
			funcs.GetObjectParameterivARB, funcs.GetInfoLogARB, funcs.GetAttachedObjectsARB, funcs.GetUniformLocationARB, funcs.GetActiveUniformARB, 
			funcs.GetUniformfvARB, funcs.GetUniformivARB, funcs.GetShaderSourceARB
		);

		return GL.checkExtension("GL_ARB_shader_objects", funcs, supported);
	}

	// --- [ glDeleteObjectARB ] ---

	/**
	 * Either deletes the object, or flags it for deletion. An object that is attached to a container object is not deleted until it is no longer attached to
	 * any container object, for any context. If it is still attached to at least one container object, the object is flagged for deletion. If the object is
	 * part of the current rendering state, it is not deleted until it is no longer part of the current rendering state for any context. If the object is still
	 * part of the rendering state of at least one context, it is flagged for deletion.
	 * 
	 * <p>If an object is flagged for deletion, its Boolean status bit {@link #GL_OBJECT_DELETE_STATUS_ARB OBJECT_DELETE_STATUS_ARB} is set to true.</p>
	 * 
	 * <p>DeleteObjectARB will silently ignore the value zero.</p>
	 * 
	 * <p>When a container object is deleted, it will detach each attached object as part of the deletion process. When an object is deleted, all information for
	 * the object referenced is lost. The data for the object is also deleted.</p>
	 *
	 * @param obj the shader object to delete
	 */
	public static void glDeleteObjectARB(int obj) {
		long __functionAddress = getInstance().DeleteObjectARB;
		callIV(__functionAddress, obj);
	}

	// --- [ glGetHandleARB ] ---

	/**
	 * Returns the handle to an object that is in use as part of current state.
	 *
	 * @param pname the state item for which the current object is to be returned. Must be:<br>{@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}
	 */
	public static int glGetHandleARB(int pname) {
		long __functionAddress = getInstance().GetHandleARB;
		return callII(__functionAddress, pname);
	}

	// --- [ glDetachObjectARB ] ---

	/**
	 * Detaches an object from the container object it is attached to.
	 *
	 * @param containerObj the container object
	 * @param attachedObj  the object to detach
	 */
	public static void glDetachObjectARB(int containerObj, int attachedObj) {
		long __functionAddress = getInstance().DetachObjectARB;
		callIIV(__functionAddress, containerObj, attachedObj);
	}

	// --- [ glCreateShaderObjectARB ] ---

	/**
	 * Creates a shader object.
	 *
	 * @param shaderType the type of the shader object to be created. One of:<br>{@link ARBVertexShader#GL_VERTEX_SHADER_ARB VERTEX_SHADER_ARB}, {@link ARBFragmentShader#GL_FRAGMENT_SHADER_ARB FRAGMENT_SHADER_ARB}
	 */
	public static int glCreateShaderObjectARB(int shaderType) {
		long __functionAddress = getInstance().CreateShaderObjectARB;
		return callII(__functionAddress, shaderType);
	}

	// --- [ glShaderSourceARB ] ---

	/** Unsafe version of {@link #glShaderSourceARB ShaderSourceARB} */
	public static void nglShaderSourceARB(int shaderObj, int count, long string, long length) {
		long __functionAddress = getInstance().ShaderSourceARB;
		callIIPPV(__functionAddress, shaderObj, count, string, length);
	}

	/**
	 * Sets the source code for the specified shader object {@code shaderObj} to the text strings in the {@code string} array. If the object previously had
	 * source code loaded into it, it is completely replaced.
	 * 
	 * <p>The strings that are loaded into a shader object are expected to form the source code for a valid shader as defined in the OpenGL Shading Language
	 * Specification.</p>
	 *
	 * @param shaderObj the shader object
	 * @param count     the number of strings in the array
	 * @param string    an array of pointers to one or more, optionally null terminated, character strings that make up the source code
	 * @param length    an array with the number of charARBs in each string (the string length). Each element in this array can be set to negative one (or smaller),
	 *                  indicating that its accompanying string is null terminated. If {@code length} is set to {@code NULL}, all strings in the {@code string} argument are
	 *                  considered null terminated.
	 */
	public static void glShaderSourceARB(int shaderObj, int count, ByteBuffer string, ByteBuffer length) {
		if ( CHECKS ) {
			checkBuffer(string, count << POINTER_SHIFT);
			if ( length != null ) checkBuffer(length, count << 2);
		}
		nglShaderSourceARB(shaderObj, count, memAddress(string), memAddressSafe(length));
	}

	/** Alternative version of: {@link #glShaderSourceARB ShaderSourceARB} */
	public static void glShaderSourceARB(int shaderObj, PointerBuffer string, IntBuffer length) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, string.remaining());
		nglShaderSourceARB(shaderObj, string.remaining(), memAddress(string), memAddressSafe(length));
	}

	/** Array version of: {@link #glShaderSourceARB ShaderSourceARB} */
	public static void glShaderSourceARB(int shaderObj, CharSequence... string) {
		APIBuffer __buffer = apiBuffer();
		int stringAddress = __buffer.pointerArrayParamUTF8i(string);
		try {
			nglShaderSourceARB(shaderObj, string.length, __buffer.address(stringAddress), __buffer.address(stringAddress + (string.length << POINTER_SHIFT)));
		} finally {
			__buffer.pointerArrayFree(stringAddress, string.length);
		}
	}

	/** Single string version of: {@link #glShaderSourceARB ShaderSourceARB} */
	public static void glShaderSourceARB(int shaderObj, CharSequence string) {
		APIBuffer __buffer = apiBuffer();
		int stringAddress = __buffer.pointerArrayParamUTF8i(string);
		try {
			nglShaderSourceARB(shaderObj, 1, __buffer.address(stringAddress), __buffer.address(stringAddress + POINTER_SIZE));
		} finally {
			__buffer.pointerArrayFree(stringAddress, 1);
		}
	}

	// --- [ glCompileShaderARB ] ---

	/**
	 * Compiles a shader object. Each shader object has a Boolean status, {@link #GL_OBJECT_COMPILE_STATUS_ARB OBJECT_COMPILE_STATUS_ARB}, that is modified as a result of compilation. This status
	 * can be queried with {@link #glGetObjectParameteriARB GetObjectParameteriARB}. This status will be set to {@link GL11#GL_TRUE TRUE} if the shader {@code shaderObj} was compiled without errors and is
	 * ready for use, and {@link GL11#GL_FALSE FALSE} otherwise. Compilation can fail for a variety of reasons as listed in the OpenGL Shading Language Specification. If
	 * CompileShaderARB failed, any information about a previous compile is lost and is not restored. Thus a failed compile does not restore the old state of
	 * {@code shaderObj}. If {@code shaderObj} does not reference a shader object, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.
	 * 
	 * <p>Note that changing the source code of a shader object, through ShaderSourceARB, does not change its compile status {@link #GL_OBJECT_COMPILE_STATUS_ARB OBJECT_COMPILE_STATUS_ARB}.</p>
	 * 
	 * <p>Each shader object has an information log that is modified as a result of compilation. This information log can be queried with {@link #glGetInfoLogARB GetInfoLogARB} to
	 * obtain more information about the compilation attempt.</p>
	 *
	 * @param shaderObj the shader object to compile
	 */
	public static void glCompileShaderARB(int shaderObj) {
		long __functionAddress = getInstance().CompileShaderARB;
		callIV(__functionAddress, shaderObj);
	}

	// --- [ glCreateProgramObjectARB ] ---

	/**
	 * Creates a program object.
	 * 
	 * <p>A program object is a container object. Shader objects are attached to a program object with the command AttachObjectARB. It is permissible to attach
	 * shader objects to program objects before source code has been loaded into the shader object, or before the shader object has been compiled. It is
	 * permissible to attach multiple shader objects of the same type to a single program object, and it is permissible to attach a shader object to more than
	 * one program object.</p>
	 */
	public static int glCreateProgramObjectARB() {
		long __functionAddress = getInstance().CreateProgramObjectARB;
		return callI(__functionAddress);
	}

	// --- [ glAttachObjectARB ] ---

	/**
	 * Attaches an object to a container object.
	 *
	 * @param containerObj the container object
	 * @param obj          the object to attach
	 */
	public static void glAttachObjectARB(int containerObj, int obj) {
		long __functionAddress = getInstance().AttachObjectARB;
		callIIV(__functionAddress, containerObj, obj);
	}

	// --- [ glLinkProgramARB ] ---

	/**
	 * Links a program object.
	 * 
	 * <p>Each program object has a Boolean status, {@link #GL_OBJECT_LINK_STATUS_ARB OBJECT_LINK_STATUS_ARB}, that is modified as a result of linking. This status can be queried with
	 * {@link #glGetObjectParameteriARB GetObjectParameteriARB}. This status will be set to {@link GL11#GL_TRUE TRUE} if a valid executable is created, and {@link GL11#GL_FALSE FALSE} otherwise. Linking can fail for a
	 * variety of reasons as specified in the OpenGL Shading Language Specification. Linking will also fail if one or more of the shader objects, attached to
	 * {@code programObj}, are not compiled successfully, or if more active uniform or active sampler variables are used in {@code programObj} than allowed.
	 * If LinkProgramARB failed, any information about a previous link is lost and is not restored. Thus a failed link does not restore the old state of
	 * {@code programObj}. If {@code programObj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.</p>
	 * 
	 * <p>Each program object has an information log that is modified as a result of a link operation. This information log can be queried with {@link #glGetInfoLogARB GetInfoLogARB}
	 * to obtain more information about the link operation.</p>
	 *
	 * @param programObj the program object to link
	 */
	public static void glLinkProgramARB(int programObj) {
		long __functionAddress = getInstance().LinkProgramARB;
		callIV(__functionAddress, programObj);
	}

	// --- [ glUseProgramObjectARB ] ---

	/**
	 * Installs the executable code as part of current rendering state if the program object {@code programObj} contains valid executable code, i.e. has been
	 * linked successfully. If UseProgramObjectARB is called with the handle set to 0, it is as if the GL had no programmable stages and the fixed
	 * functionality paths will be used instead. If {@code programObj} cannot be made part of the current rendering state, an {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error will
	 * be generated and the current rendering state left unmodified. This error will be set, for example, if {@code programObj} has not been linked
	 * successfully. If {@code programObj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.
	 * 
	 * <p>While a program object is in use, applications are free to modify attached shader objects, compile attached shader objects, attach additional shader
	 * objects, and detach shader objects. This does not affect the link status {@link #GL_OBJECT_LINK_STATUS_ARB OBJECT_LINK_STATUS_ARB} of the program object. This does not affect the
	 * executable code that is part of the current state either. That executable code is only affected when the program object has been re-linked successfully.
	 * After such a successful re-link, the {@link #glLinkProgramARB LinkProgramARB} command will install the generated executable code as part of the current rendering state if the
	 * specified program object was already in use as a result of a previous call to UseProgramObjectARB. If this re-link failed, then the executable code part
	 * of the current state does not change.</p>
	 *
	 * @param programObj the program object to use
	 */
	public static void glUseProgramObjectARB(int programObj) {
		long __functionAddress = getInstance().UseProgramObjectARB;
		callIV(__functionAddress, programObj);
	}

	// --- [ glValidateProgramARB ] ---

	/**
	 * Validates the program object {@code programObj} against the GL state at that moment. Each program object has a Boolean status,
	 * {@link #GL_OBJECT_VALIDATE_STATUS_ARB OBJECT_VALIDATE_STATUS_ARB}, that is modified as a result of validation. This status can be queried with {@link #glGetObjectParameteriARB GetObjectParameteriARB}. If validation
	 * succeeded this status will be set to {@link GL11#GL_TRUE TRUE}, otherwise it will be set to {@link GL11#GL_FALSE FALSE}. If validation succeeded the program object is guaranteed to
	 * execute, given the current GL state. If validation failed, the program object is guaranteed to not execute, given the current GL state. If
	 * {@code programObj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.
	 * 
	 * <p>ValidateProgramARB will validate at least as much as is done when a rendering command is issued, and it could validate more. For example, it could give
	 * a hint on how to optimize some piece of shader code.</p>
	 * 
	 * <p>ValidateProgramARB will store its information in the info log. This information will either be an empty string or it will contain validation information.</p>
	 * 
	 * <p>ValidateProgramARB is typically only useful during application development. An application should not expect different OpenGL implementations to produce
	 * identical information.</p>
	 *
	 * @param programObj the program object to validate
	 */
	public static void glValidateProgramARB(int programObj) {
		long __functionAddress = getInstance().ValidateProgramARB;
		callIV(__functionAddress, programObj);
	}

	// --- [ glUniform1fARB ] ---

	/**
	 * float version of {@link #glUniform4fARB Uniform4fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 */
	public static void glUniform1fARB(int location, float v0) {
		long __functionAddress = getInstance().Uniform1fARB;
		callIFV(__functionAddress, location, v0);
	}

	// --- [ glUniform2fARB ] ---

	/**
	 * vec2 version of {@link #glUniform4fARB Uniform4fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2fARB(int location, float v0, float v1) {
		long __functionAddress = getInstance().Uniform2fARB;
		callIFFV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3fARB ] ---

	/**
	 * vec3 version of {@link #glUniform4fARB Uniform4fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3fARB(int location, float v0, float v1, float v2) {
		long __functionAddress = getInstance().Uniform3fARB;
		callIFFFV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4fARB ] ---

	/**
	 * Loads a vec4 value into a uniform variable of the program object that is currently in use.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {
		long __functionAddress = getInstance().Uniform4fARB;
		callIFFFFV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1iARB ] ---

	/**
	 * int version of {@link #glUniform1fARB Uniform1fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 */
	public static void glUniform1iARB(int location, int v0) {
		long __functionAddress = getInstance().Uniform1iARB;
		callIIV(__functionAddress, location, v0);
	}

	// --- [ glUniform2iARB ] ---

	/**
	 * ivec2 version of {@link #glUniform2fARB Uniform2fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 */
	public static void glUniform2iARB(int location, int v0, int v1) {
		long __functionAddress = getInstance().Uniform2iARB;
		callIIIV(__functionAddress, location, v0, v1);
	}

	// --- [ glUniform3iARB ] ---

	/**
	 * ivec3 version of {@link #glUniform3fARB Uniform3fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 */
	public static void glUniform3iARB(int location, int v0, int v1, int v2) {
		long __functionAddress = getInstance().Uniform3iARB;
		callIIIIV(__functionAddress, location, v0, v1, v2);
	}

	// --- [ glUniform4iARB ] ---

	/**
	 * ivec4 version of {@link #glUniform4fARB Uniform4fARB}.
	 *
	 * @param location the uniform variable location
	 * @param v0       the uniform x value
	 * @param v1       the uniform y value
	 * @param v2       the uniform z value
	 * @param v3       the uniform w value
	 */
	public static void glUniform4iARB(int location, int v0, int v1, int v2, int v3) {
		long __functionAddress = getInstance().Uniform4iARB;
		callIIIIIV(__functionAddress, location, v0, v1, v2, v3);
	}

	// --- [ glUniform1fvARB ] ---

	/** Unsafe version of {@link #glUniform1fvARB Uniform1fvARB} */
	public static void nglUniform1fvARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1fvARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads floating-point values {@code count} times into a uniform location defined as an array of float values.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of float values to load
	 * @param value    the values to load
	 */
	public static void glUniform1fvARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1fvARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1fvARB Uniform1fvARB} */
	public static void glUniform1fvARB(int location, FloatBuffer value) {
		nglUniform1fvARB(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2fvARB ] ---

	/** Unsafe version of {@link #glUniform2fvARB Uniform2fvARB} */
	public static void nglUniform2fvARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2fvARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads floating-point values {@code count} times into a uniform location defined as an array of vec2 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of vec2 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform2fvARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2fvARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2fvARB Uniform2fvARB} */
	public static void glUniform2fvARB(int location, FloatBuffer value) {
		nglUniform2fvARB(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3fvARB ] ---

	/** Unsafe version of {@link #glUniform3fvARB Uniform3fvARB} */
	public static void nglUniform3fvARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3fvARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads floating-point values {@code count} times into a uniform location defined as an array of vec3 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of vec3 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform3fvARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3fvARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3fvARB Uniform3fvARB} */
	public static void glUniform3fvARB(int location, FloatBuffer value) {
		nglUniform3fvARB(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4fvARB ] ---

	/** Unsafe version of {@link #glUniform4fvARB Uniform4fvARB} */
	public static void nglUniform4fvARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4fvARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads floating-point values {@code count} times into a uniform location defined as an array of vec4 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of vec4 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform4fvARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4fvARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4fvARB Uniform4fvARB} */
	public static void glUniform4fvARB(int location, FloatBuffer value) {
		nglUniform4fvARB(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniform1ivARB ] ---

	/** Unsafe version of {@link #glUniform1ivARB Uniform1ivARB} */
	public static void nglUniform1ivARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform1ivARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads integer values {@code count} times into a uniform location defined as an array of integer values.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of integer values to load
	 * @param value    the values to load
	 */
	public static void glUniform1ivARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, count << 2);
		nglUniform1ivARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform1ivARB Uniform1ivARB} */
	public static void glUniform1ivARB(int location, IntBuffer value) {
		nglUniform1ivARB(location, value.remaining(), memAddress(value));
	}

	// --- [ glUniform2ivARB ] ---

	/** Unsafe version of {@link #glUniform2ivARB Uniform2ivARB} */
	public static void nglUniform2ivARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform2ivARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads integer values {@code count} times into a uniform location defined as an array of ivec2 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of ivec2 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform2ivARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 1) << 2);
		nglUniform2ivARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform2ivARB Uniform2ivARB} */
	public static void glUniform2ivARB(int location, IntBuffer value) {
		nglUniform2ivARB(location, value.remaining() >> 1, memAddress(value));
	}

	// --- [ glUniform3ivARB ] ---

	/** Unsafe version of {@link #glUniform3ivARB Uniform3ivARB} */
	public static void nglUniform3ivARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform3ivARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads integer values {@code count} times into a uniform location defined as an array of ivec3 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of ivec3 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform3ivARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count * 3) << 2);
		nglUniform3ivARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform3ivARB Uniform3ivARB} */
	public static void glUniform3ivARB(int location, IntBuffer value) {
		nglUniform3ivARB(location, value.remaining() / 3, memAddress(value));
	}

	// --- [ glUniform4ivARB ] ---

	/** Unsafe version of {@link #glUniform4ivARB Uniform4ivARB} */
	public static void nglUniform4ivARB(int location, int count, long value) {
		long __functionAddress = getInstance().Uniform4ivARB;
		callIIPV(__functionAddress, location, count, value);
	}

	/**
	 * Loads integer values {@code count} times into a uniform location defined as an array of ivec4 vectors.
	 *
	 * @param location the uniform variable location
	 * @param count    the number of ivec4 vectors to load
	 * @param value    the values to load
	 */
	public static void glUniform4ivARB(int location, int count, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniform4ivARB(location, count, memAddress(value));
	}

	/** Alternative version of: {@link #glUniform4ivARB Uniform4ivARB} */
	public static void glUniform4ivARB(int location, IntBuffer value) {
		nglUniform4ivARB(location, value.remaining() >> 2, memAddress(value));
	}

	// --- [ glUniformMatrix2fvARB ] ---

	/** Unsafe version of {@link #glUniformMatrix2fvARB UniformMatrix2fvARB} */
	public static void nglUniformMatrix2fvARB(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix2fvARB;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	/**
	 * Loads a 2x2 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.
	 *
	 * @param location  the uniform variable location
	 * @param count     the number of 2x2 matrices to load
	 * @param transpose if {@link GL11#GL_FALSE FALSE}, the matrix is specified in column major order, otherwise in row major order
	 * @param value     the matrix values to load
	 */
	public static void glUniformMatrix2fvARB(int location, int count, boolean transpose, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 2) << 2);
		nglUniformMatrix2fvARB(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix2fvARB UniformMatrix2fvARB} */
	public static void glUniformMatrix2fvARB(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix2fvARB(location, value.remaining() >> 2, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix3fvARB ] ---

	/** Unsafe version of {@link #glUniformMatrix3fvARB UniformMatrix3fvARB} */
	public static void nglUniformMatrix3fvARB(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix3fvARB;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	/**
	 * Loads a 3x3 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.
	 *
	 * @param location  the uniform variable location
	 * @param count     the number of 3x3 matrices to load
	 * @param transpose if {@link GL11#GL_FALSE FALSE}, the matrix is specified in column major order, otherwise in row major order
	 * @param value     the matrix values to load
	 */
	public static void glUniformMatrix3fvARB(int location, int count, boolean transpose, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count * 9) << 2);
		nglUniformMatrix3fvARB(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix3fvARB UniformMatrix3fvARB} */
	public static void glUniformMatrix3fvARB(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix3fvARB(location, value.remaining() / 9, transpose, memAddress(value));
	}

	// --- [ glUniformMatrix4fvARB ] ---

	/** Unsafe version of {@link #glUniformMatrix4fvARB UniformMatrix4fvARB} */
	public static void nglUniformMatrix4fvARB(int location, int count, boolean transpose, long value) {
		long __functionAddress = getInstance().UniformMatrix4fvARB;
		callIIZPV(__functionAddress, location, count, transpose, value);
	}

	/**
	 * Loads a 4x4 matrix of floating-point values {@code count} times into a uniform location defined as a matrix or an array of matrices.
	 *
	 * @param location  the uniform variable location
	 * @param count     the number of 4x4 matrices to load
	 * @param transpose if {@link GL11#GL_FALSE FALSE}, the matrix is specified in column major order, otherwise in row major order
	 * @param value     the matrix values to load
	 */
	public static void glUniformMatrix4fvARB(int location, int count, boolean transpose, ByteBuffer value) {
		if ( CHECKS )
			checkBuffer(value, (count << 4) << 2);
		nglUniformMatrix4fvARB(location, count, transpose, memAddress(value));
	}

	/** Alternative version of: {@link #glUniformMatrix4fvARB UniformMatrix4fvARB} */
	public static void glUniformMatrix4fvARB(int location, boolean transpose, FloatBuffer value) {
		nglUniformMatrix4fvARB(location, value.remaining() >> 4, transpose, memAddress(value));
	}

	// --- [ glGetObjectParameterfvARB ] ---

	/** Unsafe version of {@link #glGetObjectParameterfvARB GetObjectParameterfvARB} */
	public static void nglGetObjectParameterfvARB(int obj, int pname, long params) {
		long __functionAddress = getInstance().GetObjectParameterfvARB;
		callIIPV(__functionAddress, obj, pname, params);
	}

	/**
	 * Returns object specific parameter values.
	 *
	 * @param obj    the object to query
	 * @param pname  the parameter to query
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetObjectParameterfvARB(int obj, int pname, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetObjectParameterfvARB(obj, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetObjectParameterfvARB GetObjectParameterfvARB} */
	public static void glGetObjectParameterfvARB(int obj, int pname, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetObjectParameterfvARB(obj, pname, memAddress(params));
	}

	// --- [ glGetObjectParameterivARB ] ---

	/** Unsafe version of {@link #glGetObjectParameterivARB GetObjectParameterivARB} */
	public static void nglGetObjectParameterivARB(int obj, int pname, long params) {
		long __functionAddress = getInstance().GetObjectParameterivARB;
		callIIPV(__functionAddress, obj, pname, params);
	}

	/**
	 * Returns object specific parameter values.
	 *
	 * @param obj    the object to query
	 * @param pname  the parameter to query. One of:<br>{@link #GL_OBJECT_TYPE_ARB OBJECT_TYPE_ARB}, {@link #GL_OBJECT_SUBTYPE_ARB OBJECT_SUBTYPE_ARB}, {@link #GL_OBJECT_DELETE_STATUS_ARB OBJECT_DELETE_STATUS_ARB}, {@link #GL_OBJECT_COMPILE_STATUS_ARB OBJECT_COMPILE_STATUS_ARB}, {@link #GL_OBJECT_LINK_STATUS_ARB OBJECT_LINK_STATUS_ARB}, {@link #GL_OBJECT_VALIDATE_STATUS_ARB OBJECT_VALIDATE_STATUS_ARB}, {@link #GL_OBJECT_INFO_LOG_LENGTH_ARB OBJECT_INFO_LOG_LENGTH_ARB}, {@link #GL_OBJECT_ATTACHED_OBJECTS_ARB OBJECT_ATTACHED_OBJECTS_ARB}, {@link #GL_OBJECT_ACTIVE_UNIFORMS_ARB OBJECT_ACTIVE_UNIFORMS_ARB}, {@link #GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB}, {@link #GL_OBJECT_SHADER_SOURCE_LENGTH_ARB OBJECT_SHADER_SOURCE_LENGTH_ARB}
	 * @param params a buffer in which to return the parameter value
	 */
	public static void glGetObjectParameterivARB(int obj, int pname, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetObjectParameterivARB(obj, pname, memAddress(params));
	}

	/** Alternative version of: {@link #glGetObjectParameterivARB GetObjectParameterivARB} */
	public static void glGetObjectParameterivARB(int obj, int pname, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetObjectParameterivARB(obj, pname, memAddress(params));
	}

	/** Single return value version of: {@link #glGetObjectParameterivARB GetObjectParameterivARB} */
	public static int glGetObjectParameteriARB(int obj, int pname) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetObjectParameterivARB(obj, pname, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetInfoLogARB ] ---

	/** Unsafe version of {@link #glGetInfoLogARB GetInfoLogARB} */
	public static void nglGetInfoLogARB(int obj, int maxLength, long length, long infoLog) {
		long __functionAddress = getInstance().GetInfoLogARB;
		callIIPPV(__functionAddress, obj, maxLength, length, infoLog);
	}

	/**
	 * A string that contains information about the last link or validation attempt and last compilation attempt are kept per program or shader object. This
	 * string is called the info log and can be obtained with this command.
	 * 
	 * <p>This string will be null terminated. The number of characters in the info log is given by {@link #GL_OBJECT_INFO_LOG_LENGTH_ARB OBJECT_INFO_LOG_LENGTH_ARB}, which can be queried with
	 * {@link #glGetObjectParameteriARB GetObjectParameteriARB}. If {@code obj} is a shader object, the returned info log will either be an empty string or it will contain
	 * information about the last compilation attempt for that object. If {@code obj} is a program object, the returned info log will either be an empty string
	 * or it will contain information about the last link attempt or last validation attempt for that object. If {@code obj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}
	 * or {@link #GL_SHADER_OBJECT_ARB SHADER_OBJECT_ARB}, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. If an error occurred, the return parameters {@code length} and {@code infoLog}
	 * will be unmodified.</p>
	 * 
	 * <p>The info log is typically only useful during application development and an application should not expect different OpenGL implementations to produce
	 * identical info logs.</p>
	 *
	 * @param obj       the shader object to query
	 * @param maxLength the maximum number of characters the GL is allowed to write into {@code infoLog}
	 * @param length    the actual number of characters written by the GL into {@code infoLog} is returned in {@code length}, excluding the null termination. If
	 *                  {@code length} is {@code NULL} then the GL ignores this parameter.
	 * @param infoLog   a buffer in which to return the info log
	 */
	public static void glGetInfoLogARB(int obj, int maxLength, ByteBuffer length, ByteBuffer infoLog) {
		if ( CHECKS ) {
			checkBuffer(infoLog, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetInfoLogARB(obj, maxLength, memAddressSafe(length), memAddress(infoLog));
	}

	/** Alternative version of: {@link #glGetInfoLogARB GetInfoLogARB} */
	public static void glGetInfoLogARB(int obj, IntBuffer length, ByteBuffer infoLog) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetInfoLogARB(obj, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
	}

	/** String return version of: {@link #glGetInfoLogARB GetInfoLogARB} */
	public static String glGetInfoLogARB(int obj, int maxLength) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetInfoLogARB(obj, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetInfoLogARB GetInfoLogARB} */
	public static String glGetInfoLogARB(int obj) {
		int maxLength = glGetObjectParameteriARB(obj, GL_OBJECT_INFO_LOG_LENGTH_ARB);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int infoLog = __buffer.bufferParam(maxLength);
		nglGetInfoLogARB(obj, maxLength, __buffer.address(length), __buffer.address(infoLog));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), infoLog);
	}

	// --- [ glGetAttachedObjectsARB ] ---

	/** Unsafe version of {@link #glGetAttachedObjectsARB GetAttachedObjectsARB} */
	public static void nglGetAttachedObjectsARB(int containerObj, int maxCount, long count, long obj) {
		long __functionAddress = getInstance().GetAttachedObjectsARB;
		callIIPPV(__functionAddress, containerObj, maxCount, count, obj);
	}

	/**
	 * Returns the handles of objects attached to {@code containerObj} in {@code obj}. . The number of objects attached to {@code containerObj} is given by
	 * {@link #GL_OBJECT_ATTACHED_OBJECTS_ARB OBJECT_ATTACHED_OBJECTS_ARB}, which can be queried with {@link #glGetObjectParameteriARB GetObjectParameteriARB}. If {@code containerObj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}, the
	 * error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. If an error occurred, the return parameters {@code count} and {@code obj} will be unmodified.
	 *
	 * @param containerObj the container object to query
	 * @param maxCount     the maximum number of handles the GL is allowed to write into {@code obj}
	 * @param count        a buffer in which to return the actual number of object handles written by the GL into {@code obj}. If {@code NULL} then the GL ignores this parameter.
	 * @param obj          a buffer in which to return the attached object handles
	 */
	public static void glGetAttachedObjectsARB(int containerObj, int maxCount, ByteBuffer count, ByteBuffer obj) {
		if ( CHECKS ) {
			checkBuffer(obj, maxCount << 2);
			if ( count != null ) checkBuffer(count, 1 << 2);
		}
		nglGetAttachedObjectsARB(containerObj, maxCount, memAddressSafe(count), memAddress(obj));
	}

	/** Alternative version of: {@link #glGetAttachedObjectsARB GetAttachedObjectsARB} */
	public static void glGetAttachedObjectsARB(int containerObj, IntBuffer count, IntBuffer obj) {
		if ( CHECKS )
			if ( count != null ) checkBuffer(count, 1);
		nglGetAttachedObjectsARB(containerObj, obj.remaining(), memAddressSafe(count), memAddress(obj));
	}

	/** Buffer return version of: {@link #glGetAttachedObjectsARB GetAttachedObjectsARB} */
	public static IntBuffer glGetAttachedObjectsARB(int containerObj, int maxCount) {
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		IntBuffer obj = BufferUtils.createIntBuffer(maxCount);
		nglGetAttachedObjectsARB(containerObj, maxCount, __buffer.address(count), memAddress(obj));
		obj.limit(__buffer.intValue(count));
		return obj.slice();
	}

	/** Buffer return (w/ implicit max length) version of: {@link #glGetAttachedObjectsARB GetAttachedObjectsARB} */
	public static IntBuffer glGetAttachedObjectsARB(int containerObj) {
		int maxCount = glGetObjectParameteriARB(containerObj, GL_OBJECT_ATTACHED_OBJECTS_ARB);
		APIBuffer __buffer = apiBuffer();
		int count = __buffer.intParam();
		IntBuffer obj = BufferUtils.createIntBuffer(maxCount);
		nglGetAttachedObjectsARB(containerObj, maxCount, __buffer.address(count), memAddress(obj));
		obj.limit(__buffer.intValue(count));
		return obj.slice();
	}

	// --- [ glGetUniformLocationARB ] ---

	/** Unsafe version of {@link #glGetUniformLocationARB GetUniformLocationARB} */
	public static int nglGetUniformLocationARB(int programObj, long name) {
		long __functionAddress = getInstance().GetUniformLocationARB;
		return callIPI(__functionAddress, programObj, name);
	}

	/**
	 * Returns the location of uniform variable {@code name}. {@code name} has to be a null terminated string, without white space. The value of -1 will be
	 * returned if {@code name} does not correspond to an active uniform variable name in {@code programObj} or if {@code name} starts with the reserved prefix
	 * "gl_". If {@code programObj} has not been successfully linked, or if {@code programObj} is not of type {@link #GL_PROGRAM_OBJECT_ARB PROGRAM_OBJECT_ARB}, the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. The location of a uniform variable does not change until the next link command is issued.
	 * 
	 * <p>A valid {@code name} cannot be a structure, an array of structures, or a subcomponent of a vector or a matrix. In order to identify a valid {@code name},
	 * the "." (dot) and "[]" operators can be used in {@code name} to operate on a structure or to operate on an array.</p>
	 * 
	 * <p>The first element of a uniform array is identified using the name of the uniform array appended with "[0]". Except if the last part of the string
	 * {@code name} indicates a uniform array, then the location of the first element of that array can be retrieved by either using the name of the uniform
	 * array, or the name of the uniform array appended with "[0]".</p>
	 *
	 * @param programObj the program object to query
	 * @param name       the name of the uniform variable whose location is to be queried
	 */
	public static int glGetUniformLocationARB(int programObj, ByteBuffer name) {
		if ( CHECKS )
			checkNT1(name);
		return nglGetUniformLocationARB(programObj, memAddress(name));
	}

	/** CharSequence version of: {@link #glGetUniformLocationARB GetUniformLocationARB} */
	public static int glGetUniformLocationARB(int programObj, CharSequence name) {
		APIBuffer __buffer = apiBuffer();
		int nameEncoded = __buffer.stringParamUTF8(name, true);
		return nglGetUniformLocationARB(programObj, __buffer.address(nameEncoded));
	}

	// --- [ glGetActiveUniformARB ] ---

	/** Unsafe version of {@link #glGetActiveUniformARB GetActiveUniformARB} */
	public static void nglGetActiveUniformARB(int programObj, int index, int maxLength, long length, long size, long type, long name) {
		long __functionAddress = getInstance().GetActiveUniformARB;
		callIIIPPPPV(__functionAddress, programObj, index, maxLength, length, size, type, name);
	}

	/**
	 * Determines which of the declared uniform variables are active and their sizes and types.
	 * 
	 * <p>This command provides information about the uniform selected by {@code index}. The {@code index} of 0 selects the first active uniform, and
	 * {@code index} of {@link #GL_OBJECT_ACTIVE_UNIFORMS_ARB OBJECT_ACTIVE_UNIFORMS_ARB} - 1 selects the last active uniform. The value of {@link #GL_OBJECT_ACTIVE_UNIFORMS_ARB OBJECT_ACTIVE_UNIFORMS_ARB} can be queried with
	 * {@link #glGetObjectParameteriARB GetObjectParameteriARB}. If {@code index} is greater than or equal to {@link #GL_OBJECT_ACTIVE_UNIFORMS_ARB OBJECT_ACTIVE_UNIFORMS_ARB}, the error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated.</p>
	 * 
	 * <p>If an error occurred, the return parameters {@code length}, {@code size}, {@code type} and {@code name} will be unmodified.</p>
	 * 
	 * <p>The returned uniform name can be the name of built-in uniform state as well. The length of the longest uniform name in {@code programObj} is given by
	 * {@link #GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB}, which can be queried with {@link #glGetObjectParameteriARB GetObjectParameteriARB}.</p>
	 * 
	 * <p>Each uniform variable, declared in a shader, is broken down into one or more strings using the "." (dot) and "[]" operators, if necessary, to the point
	 * that it is legal to pass each string back into {@link #glGetUniformLocationARB GetUniformLocationARB}. Each of these strings constitutes one active uniform, and each string is
	 * assigned an index.</p>
	 * 
	 * <p>If one or more elements of an array are active, GetActiveUniformARB will return the name of the array in {@code name}, subject to the restrictions
	 * listed above. The type of the array is returned in {@code type}. The {@code size} parameter contains the highest array element index used, plus one. The
	 * compiler or linker determines the highest index used. There will be only one active uniform reported by the GL per uniform array.</p>
	 * 
	 * <p>This command will return as much information about active uniforms as possible. If no information is available, {@code length} will be set to zero and
	 * {@code name} will be an empty string. This situation could arise if GetActiveUniformARB is issued after a failed link.</p>
	 *
	 * @param programObj a handle to a program object for which the command {@link #glLinkProgramARB LinkProgramARB} has been issued in the past. It is not necessary for {@code programObj} to have
	 *                   been linked successfully. The link could have failed because the number of active uniforms exceeded the limit.
	 * @param index      the uniform index
	 * @param maxLength  the maximum number of characters the GL is allowed to write into {@code name}.
	 * @param length     a buffer in which to return the actual number of characters written by the GL into {@code name}. This count excludes the null termination. If
	 *                   {@code length} is {@code NULL} then the GL ignores this parameter.
	 * @param size       a buffer in which to return the uniform size. The size is in units of the type returned in {@code type}.
	 * @param type       a buffer in which to return the uniform type
	 * @param name       a buffer in which to return the uniform name
	 */
	public static void glGetActiveUniformARB(int programObj, int index, int maxLength, ByteBuffer length, ByteBuffer size, ByteBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			checkBuffer(name, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
			checkBuffer(size, 1 << 2);
			checkBuffer(type, 1 << 2);
		}
		nglGetActiveUniformARB(programObj, index, maxLength, memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** Alternative version of: {@link #glGetActiveUniformARB GetActiveUniformARB} */
	public static void glGetActiveUniformARB(int programObj, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
		if ( CHECKS ) {
			if ( length != null ) checkBuffer(length, 1);
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		nglGetActiveUniformARB(programObj, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
	}

	/** String return version of: {@link #glGetActiveUniformARB GetActiveUniformARB} */
	public static String glGetActiveUniformARB(int programObj, int index, int maxLength, IntBuffer size, IntBuffer type) {
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveUniformARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), name);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetActiveUniformARB GetActiveUniformARB} */
	public static String glGetActiveUniformARB(int programObj, int index, IntBuffer size, IntBuffer type) {
		int maxLength = glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB);
		if ( CHECKS ) {
			checkBuffer(size, 1);
			checkBuffer(type, 1);
		}
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int name = __buffer.bufferParam(maxLength);
		nglGetActiveUniformARB(programObj, index, maxLength, __buffer.address(length), memAddress(size), memAddress(type), __buffer.address(name));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), name);
	}

	// --- [ glGetUniformfvARB ] ---

	/** Unsafe version of {@link #glGetUniformfvARB GetUniformfvARB} */
	public static void nglGetUniformfvARB(int programObj, int location, long params) {
		long __functionAddress = getInstance().GetUniformfvARB;
		callIIPV(__functionAddress, programObj, location, params);
	}

	/**
	 * Returns the floating-point value or values of a uniform.
	 *
	 * @param programObj the program object to query
	 * @param location   the uniform variable location
	 * @param params     a buffer in which to return the uniform values
	 */
	public static void glGetUniformfvARB(int programObj, int location, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformfvARB(programObj, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformfvARB GetUniformfvARB} */
	public static void glGetUniformfvARB(int programObj, int location, FloatBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformfvARB(programObj, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformfvARB GetUniformfvARB} */
	public static float glGetUniformfARB(int programObj, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.floatParam();
		nglGetUniformfvARB(programObj, location, __buffer.address(params));
		return __buffer.floatValue(params);
	}

	// --- [ glGetUniformivARB ] ---

	/** Unsafe version of {@link #glGetUniformivARB GetUniformivARB} */
	public static void nglGetUniformivARB(int programObj, int location, long params) {
		long __functionAddress = getInstance().GetUniformivARB;
		callIIPV(__functionAddress, programObj, location, params);
	}

	/**
	 * Returns the integer value or values of a uniform.
	 *
	 * @param programObj the program object to query
	 * @param location   the uniform variable location
	 * @param params     a buffer in which to return the uniform values
	 */
	public static void glGetUniformivARB(int programObj, int location, ByteBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1 << 2);
		nglGetUniformivARB(programObj, location, memAddress(params));
	}

	/** Alternative version of: {@link #glGetUniformivARB GetUniformivARB} */
	public static void glGetUniformivARB(int programObj, int location, IntBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetUniformivARB(programObj, location, memAddress(params));
	}

	/** Single return value version of: {@link #glGetUniformivARB GetUniformivARB} */
	public static int glGetUniformiARB(int programObj, int location) {
		APIBuffer __buffer = apiBuffer();
		int params = __buffer.intParam();
		nglGetUniformivARB(programObj, location, __buffer.address(params));
		return __buffer.intValue(params);
	}

	// --- [ glGetShaderSourceARB ] ---

	/** Unsafe version of {@link #glGetShaderSourceARB GetShaderSourceARB} */
	public static void nglGetShaderSourceARB(int obj, int maxLength, long length, long source) {
		long __functionAddress = getInstance().GetShaderSourceARB;
		callIIPPV(__functionAddress, obj, maxLength, length, source);
	}

	/**
	 * Returns the string making up the source code for a shader object.
	 * 
	 * <p>The string {@code source} is a concatenation of the strings passed to OpenGL using {@link #glShaderSourceARB ShaderSourceARB}. The length of this concatenation is given by
	 * {@link #GL_OBJECT_SHADER_SOURCE_LENGTH_ARB OBJECT_SHADER_SOURCE_LENGTH_ARB}, which can be queried with {@link #glGetObjectParameteriARB GetObjectParameteriARB}. If {@code obj} is not of type {@link #GL_SHADER_OBJECT_ARB SHADER_OBJECT_ARB}, the error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated. If an error occurred, the return parameters {@code length} and {@code source} will be unmodified.</p>
	 *
	 * @param obj       the shader object to query
	 * @param maxLength the maximum number of characters the GL is allowed to write into {@code source}
	 * @param length    a buffer in which to return the actual number of characters written by the GL into {@code source}, excluding the null termination. If {@code length} is NULL
	 *                  then the GL ignores this parameter.
	 * @param source    a buffer in which to return the shader object source
	 */
	public static void glGetShaderSourceARB(int obj, int maxLength, ByteBuffer length, ByteBuffer source) {
		if ( CHECKS ) {
			checkBuffer(source, maxLength);
			if ( length != null ) checkBuffer(length, 1 << 2);
		}
		nglGetShaderSourceARB(obj, maxLength, memAddressSafe(length), memAddress(source));
	}

	/** Alternative version of: {@link #glGetShaderSourceARB GetShaderSourceARB} */
	public static void glGetShaderSourceARB(int obj, IntBuffer length, ByteBuffer source) {
		if ( CHECKS )
			if ( length != null ) checkBuffer(length, 1);
		nglGetShaderSourceARB(obj, source.remaining(), memAddressSafe(length), memAddress(source));
	}

	/** String return version of: {@link #glGetShaderSourceARB GetShaderSourceARB} */
	public static String glGetShaderSourceARB(int obj, int maxLength) {
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(maxLength);
		nglGetShaderSourceARB(obj, maxLength, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

	/** String return (w/ implicit max length) version of: {@link #glGetShaderSourceARB GetShaderSourceARB} */
	public static String glGetShaderSourceARB(int obj) {
		int maxLength = glGetObjectParameteriARB(obj, GL_OBJECT_SHADER_SOURCE_LENGTH_ARB);
		APIBuffer __buffer = apiBuffer();
		int length = __buffer.intParam();
		int source = __buffer.bufferParam(maxLength);
		nglGetShaderSourceARB(obj, maxLength, __buffer.address(length), __buffer.address(source));
		return memDecodeUTF8(__buffer.buffer(), __buffer.intValue(length), source);
	}

}