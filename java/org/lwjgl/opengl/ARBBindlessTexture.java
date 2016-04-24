/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/ARB/bindless_texture.txt">ARB_bindless_texture</a> extension.
 * 
 * <p>This extension allows OpenGL applications to access texture objects in shaders without first binding each texture to one of a limited number of texture
 * image units. Using this extension, an application can query a 64-bit unsigned integer texture handle for each texture that it wants to access and then
 * use that handle directly in GLSL or assembly-based shaders. The ability to access textures without having to bind and/or re-bind them is similar to the
 * capability provided by the <a href="http://www.opengl.org/registry/specs/NV/shader_buffer_load.txt">NV_shader_buffer_load</a> extension that allows shaders to access buffer objects without binding them. In
 * both cases, these extensions significantly reduce the amount of API and internal GL driver overhead needed to manage resource bindings.</p>
 * 
 * <p>This extension also provides similar capability for the image load, store, and atomic functionality provided by OpenGL 4.2 and the
 * {@link ARBShaderImageLoadStore ARB_shader_image_load_store} and <a href="http://www.opengl.org/registry/specs/EXT/shader_image_load_store.txt">EXT_shader_image_load_store</a> extensions, where a texture can be accessed without first
 * binding it to an image unit. An image handle can be extracted from a texture object using an API with a set of parameters similar to those for
 * BindImageTextureEXT.</p>
 * 
 * <p>This extension adds no new data types to GLSL. Instead, it uses existing sampler and image data types and allows them to be populated with texture and
 * image handles. This extension does permit sampler and image data types to be used in more contexts than in unextended GLSL 4.00. In particular, sampler
 * and image types may be used as shader inputs/outputs, temporary variables, and uniform block members, and may be assigned to by shader code.
 * Constructors are provided to convert unsigned integer values to and from sampler and image data types. Additionally, new APIs are provided to load
 * values for sampler and image uniforms with 64-bit handle inputs. The use of existing integer-based Uniform* APIs is still permitted, in which case the
 * integer specified will identify a texture image or image unit. For samplers and images with values specified as texture image or image units, the GL
 * implemenation will translate the unit number to an internal handle as required.</p>
 * 
 * <p>To access texture or image resources using handles, the handles must first be made resident. Accessing a texture or image by handle without first making
 * it resident can result in undefined results, including program termination. Since the amount of texture memory required by an application may exceed the
 * amount of memory available to the system, this extension provides API calls allowing applications to manage overall texture memory consumption by making
 * a texture resident and non-resident as required.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBBindlessTexture {

	/** Accepted by the {@code type} parameter of VertexAttribLPointer. */
	public static final int GL_UNSIGNED_INT64_ARB = 0x140F;

	protected ARBBindlessTexture() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLCapabilities caps) {
		return checkFunctions(
			caps.glGetTextureHandleARB, caps.glGetTextureSamplerHandleARB, caps.glMakeTextureHandleResidentARB, caps.glMakeTextureHandleNonResidentARB, 
			caps.glGetImageHandleARB, caps.glMakeImageHandleResidentARB, caps.glMakeImageHandleNonResidentARB, caps.glUniformHandleui64ARB, 
			caps.glUniformHandleui64vARB, caps.glProgramUniformHandleui64ARB, caps.glProgramUniformHandleui64vARB, caps.glIsTextureHandleResidentARB, 
			caps.glIsImageHandleResidentARB, caps.glVertexAttribL1ui64ARB, caps.glVertexAttribL1ui64vARB, caps.glGetVertexAttribLui64vARB
		);
	}

	// --- [ glGetTextureHandleARB ] ---

	/**
	 * Creates a texture handle using the current state of the texture named {@code texture}, including any embedded sampler state. See
	 * {@link #glGetTextureSamplerHandleARB GetTextureSamplerHandleARB} for details.
	 *
	 * @param texture the texture object
	 */
	public static long glGetTextureHandleARB(int texture) {
		long __functionAddress = GL.getCapabilities().glGetTextureHandleARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJ(__functionAddress, texture);
	}

	// --- [ glGetTextureSamplerHandleARB ] ---

	/**
	 * Creates a texture handle using the current non-sampler state from the texture named {@code texture} and the sampler state from the sampler object
	 * {@code sampler}. In both cases, a 64-bit unsigned integer handle is returned. The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated if {@code texture} is zero or is
	 * not the name of an existing texture object or if {@code sampler} is zero or is not the name of an existing sampler object. The error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if the texture object {@code texture} is not complete. If an error occurs, a handle of zero is returned.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if the border color (taken from the embedded sampler for GetTextureHandleARB or from the {@code sampler}
	 * for GetTextureSamplerHandleARB) is not one of the following allowed values. If the texture's base internal format is signed or unsigned integer, allowed
	 * values are (0,0,0,0), (0,0,0,1), (1,1,1,0), and (1,1,1,1). If the base internal format is not integer, allowed values are (0.0,0.0,0.0,0.0),
	 * (0.0,0.0,0.0,1.0), (1.0,1.0,1.0,0.0), and (1.0,1.0,1.0,1.0).</p>
	 * 
	 * <p>The handle for each texture or texture/sampler pair is unique; the same handle will be returned if GetTextureHandleARB is called multiple times for the
	 * same texture or if GetTextureSamplerHandleARB is called multiple times for the same texture/sampler pair.</p>
	 * 
	 * <p>When a texture object is referenced by one or more texture handles, the texture parameters of the object may not be changed, and the size and format of
	 * the images in the texture object may not be re-specified. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if the functions TexImage*, CopyTexImage*,
	 * CompressedTexImage*, TexBuffer*, or TexParameter* are called to modify a texture object referenced by one or more texture handles. The contents of the
	 * images in a texture object may still be updated via commands such as TexSubImage*, CopyTexSubImage*, and CompressedTexSubImage*, and by rendering to a
	 * framebuffer object, even if the texture object is referenced by one or more texture handles.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL15#glBufferData BufferData} if it is called to modify a buffer object bound to a buffer texture while that
	 * texture object is referenced by one or more texture handles. The contents of the buffer object may still be updated via buffer update commands such as
	 * {@link GL15#glBufferSubData BufferSubData} and MapBuffer*, or via the texture update commands, even if the buffer is bound to a texture while that buffer texture object is
	 * referenced by one or more texture handles.</p>
	 * 
	 * <p>When a sampler object is referenced by one or more texture handles, the sampler parameters of the object may not be changed. The error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated when calling SamplerParameter* functions to modify a sampler object referenced by one or more texture handles.</p>
	 *
	 * @param texture the texture object
	 * @param sampler the sampler object
	 */
	public static long glGetTextureSamplerHandleARB(int texture, int sampler) {
		long __functionAddress = GL.getCapabilities().glGetTextureSamplerHandleARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJ(__functionAddress, texture, sampler);
	}

	// --- [ glMakeTextureHandleResidentARB ] ---

	/**
	 * Make a texture handle resident, so that it is accessible to shaders for texture mapping operations.
	 * 
	 * <p>While the texture handle is resident, it may be used in texture mapping operations. If a shader attempts to perform a texture mapping operation using a
	 * handle that is not resident, the results of that operation are undefined and may lead to application termination. When a texture handle is resident, the
	 * texture it references is also considered resident for the purposes of the {@link GL11#glAreTexturesResident AreTexturesResident} command. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is
	 * generated if {@code handle} is not a valid texture handle, or if {@code handle} is already resident in the current GL context.</p>
	 *
	 * @param handle the texture handle
	 */
	public static void glMakeTextureHandleResidentARB(long handle) {
		long __functionAddress = GL.getCapabilities().glMakeTextureHandleResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, handle);
	}

	// --- [ glMakeTextureHandleNonResidentARB ] ---

	/**
	 * Makes a texture handle inaccessible to shaders.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if {@code handle} is not a valid texture handle, or if {@code handle} is not resident in the current GL
	 * context.</p>
	 *
	 * @param handle the texture handle
	 */
	public static void glMakeTextureHandleNonResidentARB(long handle) {
		long __functionAddress = GL.getCapabilities().glMakeTextureHandleNonResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, handle);
	}

	// --- [ glGetImageHandleARB ] ---

	/**
	 * Creates and returns an image handle for level {@code level} of the texture named {@code texture}. If {@code layered} is {@link GL11#GL_TRUE TRUE}, a handle is created
	 * for the entire texture level. If {@code layered} is {@link GL11#GL_FALSE FALSE}, a handle is created for only the layer {@code layer} of the texture level.
	 * {@code format} specifies a format used to interpret the texels of the image when used for image loads, stores, and atomics, and has the same meaning as
	 * the {@code format} parameter of BindImageTextureEXT(). A 64-bit unsigned integer handle is returned if the command succeeds; otherwise, zero is returned.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated by GetImageHandleARB if:</p>
	 * 
	 * <ul>
	 * <li>{@code texture} is zero or not the name of an existing texture object;</li>
	 * <li>the image for the texture level {@code level} doesn't exist (i.e., has a size of zero in {@code texture}); or</li>
	 * <li>{@code layered} is FALSE and {@code layer} is greater than or equal to the number of layers in the image at level {@code level}.</li>
	 * </ul>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by GetImageHandleARB if:</p>
	 * 
	 * <ul>
	 * <li>the texture object {@code texture} is not complete (section 3.9.14);</li>
	 * <li>{@code layered} is TRUE and the texture is not a three-dimensional, one-dimensional array, two dimensional array, cube map, or cube map array
	 * texture.</li>
	 * </ul>
	 * 
	 * <p>When a texture object is referenced by one or more image handles, the texture parameters of the object may not be changed, and the size and format of
	 * the images in the texture object may not be re-specified. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated when calling TexImage*, CopyTexImage*,
	 * CompressedTexImage*, TexBuffer*, or TexParameter* functions while a texture object is referenced by one or more image handles. The contents of the
	 * images in a texture object may still be updated via commands such as TexSubImage*, CopyTexSubImage*, and CompressedTexSubImage*, and by rendering to a
	 * framebuffer object, even if the texture object is referenced by one or more image handles.</p>
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL15#glBufferData BufferData} if it is called to modify a buffer object bound to a buffer texture while that texture
	 * object is referenced by one or more image handles. The contents of the buffer object may still be updated via buffer update commands such as
	 * {@link GL15#glBufferSubData BufferSubData} and MapBuffer*, or via the texture update commands, even if the buffer is bound to a texture while that buffer texture object is
	 * referenced by one or more image handles.</p>
	 * 
	 * <p>The handle returned for each combination of {@code texture}, {@code level}, {@code layered}, {@code layer}, and {@code format} is unique; the same
	 * handle will be returned if GetImageHandleARB is called multiple times with the same parameters.</p>
	 *
	 * @param texture the texture object
	 * @param level   the texture level
	 * @param layered the layered flag
	 * @param layer   the texture layer
	 * @param format  the texture format
	 */
	public static long glGetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
		long __functionAddress = GL.getCapabilities().glGetImageHandleARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJ(__functionAddress, texture, level, layered, layer, format);
	}

	// --- [ glMakeImageHandleResidentARB ] ---

	/**
	 * Makes an image handle resident, so that it is accessible to shaders for image loads, stores, and atomic operations.
	 * 
	 * <p>{@code access} specifies whether the texture bound to the image handle will be treated as {@link GL15#GL_READ_ONLY READ_ONLY}, {@link GL15#GL_WRITE_ONLY WRITE_ONLY}, or {@link GL15#GL_READ_WRITE READ_WRITE}. If a
	 * shader reads from an image handle made resident as {@link GL15#GL_WRITE_ONLY WRITE_ONLY}, or writes to an image handle made resident as {@link GL15#GL_READ_ONLY READ_ONLY}, the results of that
	 * shader operation are undefined and may lead to application termination. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if {@code handle} is not a valid
	 * image handle, or if {@code handle} is already resident in the current GL context.</p>
	 * 
	 * <p>While the image handle is resident, it may be used in image load, store, and atomic operations. If a shader attempts to perform an image operation using
	 * a handle that is not resident, the results of that operation are undefined and may lead to application termination. When an image handle is resident,
	 * the texture it references is not necessarily considered resident for the purposes of the {@link GL11#glAreTexturesResident AreTexturesResident} command.</p>
	 *
	 * @param handle the image handle
	 * @param access the access type. One of:<br><table><tr><td>{@link GL15#GL_READ_ONLY READ_ONLY}</td><td>{@link GL15#GL_WRITE_ONLY WRITE_ONLY}</td><td>{@link GL15#GL_READ_WRITE READ_WRITE}</td></tr></table>
	 */
	public static void glMakeImageHandleResidentARB(long handle, int access) {
		long __functionAddress = GL.getCapabilities().glMakeImageHandleResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, handle, access);
	}

	// --- [ glMakeImageHandleNonResidentARB ] ---

	/**
	 * Makes an image handle inaccessible to shaders.
	 *
	 * @param handle the image handle
	 */
	public static void glMakeImageHandleNonResidentARB(long handle) {
		long __functionAddress = GL.getCapabilities().glMakeImageHandleNonResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, handle);
	}

	// --- [ glUniformHandleui64ARB ] ---

	/**
	 * Loads a 64-bit unsigned integer handle into a uniform location corresponding to sampler or image variable types.
	 *
	 * @param location the uniform location
	 * @param value    the handle value
	 */
	public static void glUniformHandleui64ARB(int location, long value) {
		long __functionAddress = GL.getCapabilities().glUniformHandleui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, location, value);
	}

	// --- [ glUniformHandleui64vARB ] ---

	/**
	 * Loads {@code count} 64-bit unsigned integer handles into a uniform location corresponding to sampler or image variable types.
	 *
	 * @param location the uniform location
	 * @param count    the number of handles to load
	 * @param values   a buffer from which to load the handles
	 */
	public static void nglUniformHandleui64vARB(int location, int count, long values) {
		long __functionAddress = GL.getCapabilities().glUniformHandleui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, count, values);
	}

	/**
	 * Loads {@code count} 64-bit unsigned integer handles into a uniform location corresponding to sampler or image variable types.
	 *
	 * @param location the uniform location
	 * @param values   a buffer from which to load the handles
	 */
	public static void glUniformHandleui64vARB(int location, LongBuffer values) {
		nglUniformHandleui64vARB(location, values.remaining(), memAddress(values));
	}

	// --- [ glProgramUniformHandleui64ARB ] ---

	/**
	 * DSA version of {@link #glUniformHandleui64ARB UniformHandleui64ARB}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param value    the handle value
	 */
	public static void glProgramUniformHandleui64ARB(int program, int location, long value) {
		long __functionAddress = GL.getCapabilities().glProgramUniformHandleui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, program, location, value);
	}

	// --- [ glProgramUniformHandleui64vARB ] ---

	/**
	 * DSA version of {@link #glUniformHandleui64vARB UniformHandleui64vARB}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param count    the number of handles to load
	 * @param values   a buffer from which to load the handles
	 */
	public static void nglProgramUniformHandleui64vARB(int program, int location, int count, long values) {
		long __functionAddress = GL.getCapabilities().glProgramUniformHandleui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, count, values);
	}

	/**
	 * DSA version of {@link #glUniformHandleui64vARB UniformHandleui64vARB}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param values   a buffer from which to load the handles
	 */
	public static void glProgramUniformHandleui64vARB(int program, int location, LongBuffer values) {
		nglProgramUniformHandleui64vARB(program, location, values.remaining(), memAddress(values));
	}

	// --- [ glIsTextureHandleResidentARB ] ---

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if the specified texture handle is resident in the current context.
	 *
	 * @param handle the texture handle
	 */
	public static boolean glIsTextureHandleResidentARB(long handle) {
		long __functionAddress = GL.getCapabilities().glIsTextureHandleResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJZ(__functionAddress, handle);
	}

	// --- [ glIsImageHandleResidentARB ] ---

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if the specified image handle is resident in the current context.
	 *
	 * @param handle the image handle
	 */
	public static boolean glIsImageHandleResidentARB(long handle) {
		long __functionAddress = GL.getCapabilities().glIsImageHandleResidentARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callJZ(__functionAddress, handle);
	}

	// --- [ glVertexAttribL1ui64ARB ] ---

	/**
	 * Specifies the 64-bit unsigned integer handle value of a generic vertex attribute.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param x     the handle value
	 */
	public static void glVertexAttribL1ui64ARB(int index, long x) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1ui64ARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callJV(__functionAddress, index, x);
	}

	// --- [ glVertexAttribL1ui64vARB ] ---

	/**
	 * Pointer version of {@link #glVertexAttribL1ui64ARB VertexAttribL1ui64ARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void nglVertexAttribL1ui64vARB(int index, long v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/**
	 * Pointer version of {@link #glVertexAttribL1ui64ARB VertexAttribL1ui64ARB}.
	 *
	 * @param index the index of the generic vertex attribute to be modified
	 * @param v     the vertex attribute buffer
	 */
	public static void glVertexAttribL1ui64vARB(int index, LongBuffer v) {
		nglVertexAttribL1ui64vARB(index, memAddress(v));
	}

	// --- [ glGetVertexAttribLui64vARB ] ---

	/**
	 * Returns the 64-bit unsigned integer handle value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute index
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned data
	 */
	public static void nglGetVertexAttribLui64vARB(int index, int pname, long params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, pname, params);
	}

	/**
	 * Returns the 64-bit unsigned integer handle value of a generic vertex attribute parameter.
	 *
	 * @param index  the generic vertex attribute index
	 * @param pname  the parameter to query
	 * @param params a buffer in which to place the returned data
	 */
	public static void glGetVertexAttribLui64vARB(int index, int pname, LongBuffer params) {
		if ( CHECKS )
			checkBuffer(params, 1);
		nglGetVertexAttribLui64vARB(index, pname, memAddress(params));
	}

	/**
	 * Returns the 64-bit unsigned integer handle value of a generic vertex attribute parameter.
	 *
	 * @param index the generic vertex attribute index
	 * @param pname the parameter to query
	 */
	public static long glGetVertexAttribLui64ARB(int index, int pname) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			LongBuffer params = stack.callocLong(1);
			nglGetVertexAttribLui64vARB(index, pname, memAddress(params));
			return params.get(0);
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	/** Array version of: {@link #glUniformHandleui64vARB UniformHandleui64vARB} */
	public static void glUniformHandleui64vARB(int location, long[] values) {
		long __functionAddress = GL.getCapabilities().glUniformHandleui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, location, values.length, values);
	}

	/** Array version of: {@link #glProgramUniformHandleui64vARB ProgramUniformHandleui64vARB} */
	public static void glProgramUniformHandleui64vARB(int program, int location, long[] values) {
		long __functionAddress = GL.getCapabilities().glProgramUniformHandleui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, program, location, values.length, values);
	}

	/** Array version of: {@link #glVertexAttribL1ui64vARB VertexAttribL1ui64vARB} */
	public static void glVertexAttribL1ui64vARB(int index, long[] v) {
		long __functionAddress = GL.getCapabilities().glVertexAttribL1ui64vARB;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, index, v);
	}

	/** Array version of: {@link #glGetVertexAttribLui64vARB GetVertexAttribLui64vARB} */
	public static void glGetVertexAttribLui64vARB(int index, int pname, long[] params) {
		long __functionAddress = GL.getCapabilities().glGetVertexAttribLui64vARB;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(params, 1);
		}
		callPV(__functionAddress, index, pname, params);
	}

}