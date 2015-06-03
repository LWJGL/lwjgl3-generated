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
 * Native bindings to the <a href="http://www.opengl.org/registry/specs/NV/bindless_texture.txt">NV_bindless_texture</a> extension.
 * 
 * <p>This extension allows OpenGL applications to access texture objects in
 * shaders without first binding each texture to one of a limited number of
 * texture image units.  Using this extension, an application can query a
 * 64-bit unsigned integer texture handle for each texture that it wants to
 * access and then use that handle directly in GLSL or assembly-based
 * shaders.  The ability to access textures without having to bind and/or
 * re-bind them is similar to the capability provided by the
 * NV_shader_buffer_load extension that allows shaders to access buffer
 * objects without binding them.  In both cases, these extensions
 * significantly reduce the amount of API and internal GL driver overhead
 * needed to manage resource bindings.</p>
 * 
 * <p>This extension also provides similar capability for the image load, store,
 * and atomic functionality provided by OpenGL 4.2, OpenGL ES 3.1 and the
 * ARB_shader_image_load_store and EXT_shader_image_load_store extensions,
 * where a texture can be accessed without first binding it to an image unit.
 * An image handle can be extracted from a texture object using an API with a
 * set of parameters similar to those for BindImageTextureEXT.</p>
 * 
 * <p>This extension adds no new data types to GLSL.  Instead, it uses existing
 * sampler and image data types and allows them to be populated with texture
 * and image handles.  This extension does permit sampler and image data
 * types to be used in more contexts than in unextended GLSL 4.00.  In
 * particular, sampler and image types may be used as shader inputs/outputs,
 * temporary variables, and uniform block members, and may be assigned to by
 * shader code.  Constructors are provided to convert 64-bit unsigned integer
 * values to and from sampler and image data types.  Additionally, new APIs
 * are provided to load values for sampler and image uniforms with 64-bit
 * handle inputs.  The use of existing integer-based Uniform* APIs is still
 * permitted, in which case the integer specified will identify a texture
 * image or image unit.  For samplers and images with values specified as
 * texture image or image units, the GL implemenation will translate the unit
 * number to an internal handle as required.</p>
 * 
 * <p>To access texture or image resources using handles, the handles must first
 * be made resident.  Accessing a texture or image by handle without first
 * making it resident can result in undefined results, including program
 * termination.  Since the amount of texture memory required by an
 * application may exceed the amount of memory available to the system, this
 * extension provides API calls allowing applications to manage overall
 * texture memory consumption by making a texture resident and non-resident
 * as required.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0}.</p>
 */
public final class NVBindlessTexture {

	/** Function address. */
	@JavadocExclude
	public final long
		GetTextureHandleNV,
		GetTextureSamplerHandleNV,
		MakeTextureHandleResidentNV,
		MakeTextureHandleNonResidentNV,
		GetImageHandleNV,
		MakeImageHandleResidentNV,
		MakeImageHandleNonResidentNV,
		UniformHandleui64NV,
		UniformHandleui64vNV,
		ProgramUniformHandleui64NV,
		ProgramUniformHandleui64vNV,
		IsTextureHandleResidentNV,
		IsImageHandleResidentNV;

	@JavadocExclude
	public NVBindlessTexture(FunctionProvider provider) {
		GetTextureHandleNV = provider.getFunctionAddress("glGetTextureHandleNV");
		GetTextureSamplerHandleNV = provider.getFunctionAddress("glGetTextureSamplerHandleNV");
		MakeTextureHandleResidentNV = provider.getFunctionAddress("glMakeTextureHandleResidentNV");
		MakeTextureHandleNonResidentNV = provider.getFunctionAddress("glMakeTextureHandleNonResidentNV");
		GetImageHandleNV = provider.getFunctionAddress("glGetImageHandleNV");
		MakeImageHandleResidentNV = provider.getFunctionAddress("glMakeImageHandleResidentNV");
		MakeImageHandleNonResidentNV = provider.getFunctionAddress("glMakeImageHandleNonResidentNV");
		UniformHandleui64NV = provider.getFunctionAddress("glUniformHandleui64NV");
		UniformHandleui64vNV = provider.getFunctionAddress("glUniformHandleui64vNV");
		ProgramUniformHandleui64NV = provider.getFunctionAddress("glProgramUniformHandleui64NV");
		ProgramUniformHandleui64vNV = provider.getFunctionAddress("glProgramUniformHandleui64vNV");
		IsTextureHandleResidentNV = provider.getFunctionAddress("glIsTextureHandleResidentNV");
		IsImageHandleResidentNV = provider.getFunctionAddress("glIsImageHandleResidentNV");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link NVBindlessTexture} instance for the current context. */
	public static NVBindlessTexture getInstance() {
		return checkFunctionality(GL.getCapabilities().__NVBindlessTexture);
	}

	static NVBindlessTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_bindless_texture") ) return null;

		NVBindlessTexture funcs = new NVBindlessTexture(provider);

		boolean supported = checkFunctions(
			funcs.GetTextureHandleNV, funcs.GetTextureSamplerHandleNV, funcs.MakeTextureHandleResidentNV, funcs.MakeTextureHandleNonResidentNV, 
			funcs.GetImageHandleNV, funcs.MakeImageHandleResidentNV, funcs.MakeImageHandleNonResidentNV, funcs.UniformHandleui64NV, funcs.UniformHandleui64vNV, 
			funcs.ProgramUniformHandleui64NV, funcs.ProgramUniformHandleui64vNV, funcs.IsTextureHandleResidentNV, funcs.IsImageHandleResidentNV
		);

		return GL.checkExtension("GL_NV_bindless_texture", funcs, supported);
	}

	// --- [ glGetTextureHandleNV ] ---

	/** JNI method for {@link #glGetTextureHandleNV GetTextureHandleNV} */
	@JavadocExclude
	public static native long nglGetTextureHandleNV(int texture, long __functionAddress);

	/**
	 * Creates a texture handle using the current state of the texture named {@code texture}, including any embedded sampler state. See
	 * {@link #glGetTextureSamplerHandleNV GetTextureSamplerHandleNV} for details.
	 *
	 * @param texture the texture object
	 */
	public static long glGetTextureHandleNV(int texture) {
		long __functionAddress = getInstance().GetTextureHandleNV;
		return nglGetTextureHandleNV(texture, __functionAddress);
	}

	// --- [ glGetTextureSamplerHandleNV ] ---

	/** JNI method for {@link #glGetTextureSamplerHandleNV GetTextureSamplerHandleNV} */
	@JavadocExclude
	public static native long nglGetTextureSamplerHandleNV(int texture, int sampler, long __functionAddress);

	/**
	 * Creates a texture handle using the current non-sampler state from the texture named {@code texture} and the sampler state from the sampler object
	 * {@code sampler}. In both cases, a 64-bit unsigned integer handle is returned. The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated if {@code texture} is zero or is
	 * not the name of an existing texture object or if {@code sampler} is zero or is not the name of an existing sampler object. The error
	 * {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if the texture object {@code texture} is not complete. If an error occurs, a handle of zero is returned.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if the border color (taken from the embedded sampler for GetTextureHandleNV or from the {@code sampler}
	 * for GetTextureSamplerHandleNV) is not one of the following allowed values. If the texture's base internal format is signed or unsigned integer, allowed
	 * values are (0,0,0,0), (0,0,0,1), (1,1,1,0), and (1,1,1,1). If the base internal format is not integer, allowed values are (0.0,0.0,0.0,0.0),
	 * (0.0,0.0,0.0,1.0), (1.0,1.0,1.0,0.0), and (1.0,1.0,1.0,1.0).</p>
	 * 
	 * <p>The handle for each texture or texture/sampler pair is unique; the same handle will be returned if GetTextureHandleNV is called multiple times for the
	 * same texture or if GetTextureSamplerHandleNV is called multiple times for the same texture/sampler pair.</p>
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
	public static long glGetTextureSamplerHandleNV(int texture, int sampler) {
		long __functionAddress = getInstance().GetTextureSamplerHandleNV;
		return nglGetTextureSamplerHandleNV(texture, sampler, __functionAddress);
	}

	// --- [ glMakeTextureHandleResidentNV ] ---

	/** JNI method for {@link #glMakeTextureHandleResidentNV MakeTextureHandleResidentNV} */
	@JavadocExclude
	public static native void nglMakeTextureHandleResidentNV(long handle, long __functionAddress);

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
	public static void glMakeTextureHandleResidentNV(long handle) {
		long __functionAddress = getInstance().MakeTextureHandleResidentNV;
		nglMakeTextureHandleResidentNV(handle, __functionAddress);
	}

	// --- [ glMakeTextureHandleNonResidentNV ] ---

	/** JNI method for {@link #glMakeTextureHandleNonResidentNV MakeTextureHandleNonResidentNV} */
	@JavadocExclude
	public static native void nglMakeTextureHandleNonResidentNV(long handle, long __functionAddress);

	/**
	 * Makes a texture handle inaccessible to shaders.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if {@code handle} is not a valid texture handle, or if {@code handle} is not resident in the current GL
	 * context.</p>
	 *
	 * @param handle the texture handle
	 */
	public static void glMakeTextureHandleNonResidentNV(long handle) {
		long __functionAddress = getInstance().MakeTextureHandleNonResidentNV;
		nglMakeTextureHandleNonResidentNV(handle, __functionAddress);
	}

	// --- [ glGetImageHandleNV ] ---

	/** JNI method for {@link #glGetImageHandleNV GetImageHandleNV} */
	@JavadocExclude
	public static native long nglGetImageHandleNV(int texture, int level, boolean layered, int layer, int format, long __functionAddress);

	/**
	 * Creates and returns an image handle for level {@code level} of the texture named {@code texture}. If {@code layered} is {@link GL11#GL_TRUE TRUE}, a handle is created
	 * for the entire texture level. If {@code layered} is {@link GL11#GL_FALSE FALSE}, a handle is created for only the layer {@code layer} of the texture level.
	 * {@code format} specifies a format used to interpret the texels of the image when used for image loads, stores, and atomics, and has the same meaning as
	 * the {@code format} parameter of BindImageTextureEXT(). A 64-bit unsigned integer handle is returned if the command succeeds; otherwise, zero is returned.
	 * 
	 * <p>The error {@link GL11#GL_INVALID_VALUE INVALID_VALUE} is generated by GetImageHandleNV if:
	 * <ul>
	 * <li>{@code texture} is zero or not the name of an existing texture object;</li>
	 * <li>the image for the texture level {@code level} doesn't exist (i.e., has a size of zero in {@code texture}); or</li>
	 * <li>{@code layered} is FALSE and {@code layer} is greater than or equal to the number of layers in the image at level {@code level}.</li>
	 * </ul>
	 * The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by GetImageHandleNV if:
	 * <ul>
	 * <li>the texture object {@code texture} is not complete (section 3.9.14);</li>
	 * <li>{@code layered} is TRUE and the texture is not a three-dimensional, one-dimensional array, two dimensional array, cube map, or cube map array
	 * texture.</li>
	 * </ul>
	 * When a texture object is referenced by one or more image handles, the texture parameters of the object may not be changed, and the size and format of
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
	 * handle will be returned if GetImageHandleNV is called multiple times with the same parameters.</p>
	 *
	 * @param texture the texture object
	 * @param level   the texture level
	 * @param layered the layered flag
	 * @param layer   the texture layer
	 * @param format  the texture format
	 */
	public static long glGetImageHandleNV(int texture, int level, boolean layered, int layer, int format) {
		long __functionAddress = getInstance().GetImageHandleNV;
		return nglGetImageHandleNV(texture, level, layered, layer, format, __functionAddress);
	}

	// --- [ glMakeImageHandleResidentNV ] ---

	/** JNI method for {@link #glMakeImageHandleResidentNV MakeImageHandleResidentNV} */
	@JavadocExclude
	public static native void nglMakeImageHandleResidentNV(long handle, int access, long __functionAddress);

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
	 * @param access the access type. One of:<br>{@link GL15#GL_READ_ONLY READ_ONLY}, {@link GL15#GL_WRITE_ONLY WRITE_ONLY}, {@link GL15#GL_READ_WRITE READ_WRITE}
	 */
	public static void glMakeImageHandleResidentNV(long handle, int access) {
		long __functionAddress = getInstance().MakeImageHandleResidentNV;
		nglMakeImageHandleResidentNV(handle, access, __functionAddress);
	}

	// --- [ glMakeImageHandleNonResidentNV ] ---

	/** JNI method for {@link #glMakeImageHandleNonResidentNV MakeImageHandleNonResidentNV} */
	@JavadocExclude
	public static native void nglMakeImageHandleNonResidentNV(long handle, long __functionAddress);

	/**
	 * Makes an image handle inaccessible to shaders.
	 *
	 * @param handle the image handle
	 */
	public static void glMakeImageHandleNonResidentNV(long handle) {
		long __functionAddress = getInstance().MakeImageHandleNonResidentNV;
		nglMakeImageHandleNonResidentNV(handle, __functionAddress);
	}

	// --- [ glUniformHandleui64NV ] ---

	/** JNI method for {@link #glUniformHandleui64NV UniformHandleui64NV} */
	@JavadocExclude
	public static native void nglUniformHandleui64NV(int location, long value, long __functionAddress);

	/**
	 * Loads a 64-bit unsigned integer handle into a uniform location corresponding to sampler or image variable types.
	 *
	 * @param location the uniform location
	 * @param value    the handle value
	 */
	public static void glUniformHandleui64NV(int location, long value) {
		long __functionAddress = getInstance().UniformHandleui64NV;
		nglUniformHandleui64NV(location, value, __functionAddress);
	}

	// --- [ glUniformHandleui64vNV ] ---

	/** JNI method for {@link #glUniformHandleui64vNV UniformHandleui64vNV} */
	@JavadocExclude
	public static native void nglUniformHandleui64vNV(int location, int count, long values, long __functionAddress);

	/** Unsafe version of {@link #glUniformHandleui64vNV UniformHandleui64vNV} */
	@JavadocExclude
	public static void nglUniformHandleui64vNV(int location, int count, long values) {
		long __functionAddress = getInstance().UniformHandleui64vNV;
		nglUniformHandleui64vNV(location, count, values, __functionAddress);
	}

	/**
	 * Loads {@code count} 64-bit unsigned integer handles into a uniform location corresponding to sampler or image variable types.
	 *
	 * @param location the uniform location
	 * @param count    the number of handles to load
	 * @param values   a buffer from which to load the handles
	 */
	public static void glUniformHandleui64vNV(int location, int count, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, count << 3);
		nglUniformHandleui64vNV(location, count, memAddress(values));
	}

	/** Alternative version of: {@link #glUniformHandleui64vNV UniformHandleui64vNV} */
	public static void glUniformHandleui64vNV(int location, LongBuffer values) {
		nglUniformHandleui64vNV(location, values.remaining(), memAddress(values));
	}

	// --- [ glProgramUniformHandleui64NV ] ---

	/** JNI method for {@link #glProgramUniformHandleui64NV ProgramUniformHandleui64NV} */
	@JavadocExclude
	public static native void nglProgramUniformHandleui64NV(int program, int location, long value, long __functionAddress);

	/**
	 * DSA version of {@link #glUniformHandleui64NV UniformHandleui64NV}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param value    the handle value
	 */
	public static void glProgramUniformHandleui64NV(int program, int location, long value) {
		long __functionAddress = getInstance().ProgramUniformHandleui64NV;
		nglProgramUniformHandleui64NV(program, location, value, __functionAddress);
	}

	// --- [ glProgramUniformHandleui64vNV ] ---

	/** JNI method for {@link #glProgramUniformHandleui64vNV ProgramUniformHandleui64vNV} */
	@JavadocExclude
	public static native void nglProgramUniformHandleui64vNV(int program, int location, int count, long values, long __functionAddress);

	/** Unsafe version of {@link #glProgramUniformHandleui64vNV ProgramUniformHandleui64vNV} */
	@JavadocExclude
	public static void nglProgramUniformHandleui64vNV(int program, int location, int count, long values) {
		long __functionAddress = getInstance().ProgramUniformHandleui64vNV;
		nglProgramUniformHandleui64vNV(program, location, count, values, __functionAddress);
	}

	/**
	 * DSA version of {@link #glUniformHandleui64vNV UniformHandleui64vNV}.
	 *
	 * @param program  the program object
	 * @param location the uniform location
	 * @param count    the number of handles to load
	 * @param values   a buffer from which to load the handles
	 */
	public static void glProgramUniformHandleui64vNV(int program, int location, int count, ByteBuffer values) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(values, count << 3);
		nglProgramUniformHandleui64vNV(program, location, count, memAddress(values));
	}

	/** Alternative version of: {@link #glProgramUniformHandleui64vNV ProgramUniformHandleui64vNV} */
	public static void glProgramUniformHandleui64vNV(int program, int location, LongBuffer values) {
		nglProgramUniformHandleui64vNV(program, location, values.remaining(), memAddress(values));
	}

	// --- [ glIsTextureHandleResidentNV ] ---

	/** JNI method for {@link #glIsTextureHandleResidentNV IsTextureHandleResidentNV} */
	@JavadocExclude
	public static native boolean nglIsTextureHandleResidentNV(long handle, long __functionAddress);

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if the specified texture handle is resident in the current context.
	 *
	 * @param handle the texture handle
	 */
	public static boolean glIsTextureHandleResidentNV(long handle) {
		long __functionAddress = getInstance().IsTextureHandleResidentNV;
		return nglIsTextureHandleResidentNV(handle, __functionAddress);
	}

	// --- [ glIsImageHandleResidentNV ] ---

	/** JNI method for {@link #glIsImageHandleResidentNV IsImageHandleResidentNV} */
	@JavadocExclude
	public static native boolean nglIsImageHandleResidentNV(long handle, long __functionAddress);

	/**
	 * Returns {@link GL11#GL_TRUE TRUE} if the specified image handle is resident in the current context.
	 *
	 * @param handle the image handle
	 */
	public static boolean glIsImageHandleResidentNV(long handle) {
		long __functionAddress = getInstance().IsImageHandleResidentNV;
		return nglIsImageHandleResidentNV(handle, __functionAddress);
	}

}