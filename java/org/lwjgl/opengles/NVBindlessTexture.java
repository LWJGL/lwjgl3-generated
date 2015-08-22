/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/NV/bindless_texture.txt">NV_bindless_texture</a> extension.
 * 
 * <p>This extension allows OpenGL applications to access texture objects in shaders without first binding each texture to one of a limited number of texture
 * image units. Using this extension, an application can query a 64-bit unsigned integer texture handle for each texture that it wants to access and then
 * use that handle directly in GLSL or assembly-based shaders. The ability to access textures without having to bind and/or re-bind them is similar to the
 * capability provided by the NV_shader_buffer_load extension that allows shaders to access buffer objects without binding them. In both cases, these
 * extensions significantly reduce the amount of API and internal GL driver overhead needed to manage resource bindings.</p>
 * 
 * <p>This extension also provides similar capability for the image load, store, and atomic functionality provided by OpenGL 4.2, OpenGL ES 3.1 and the
 * ARB_shader_image_load_store and EXT_shader_image_load_store extensions, where a texture can be accessed without first binding it to an image unit. An
 * image handle can be extracted from a texture object using an API with a set of parameters similar to those for BindImageTextureEXT.</p>
 * 
 * <p>This extension adds no new data types to GLSL. Instead, it uses existing sampler and image data types and allows them to be populated with texture and
 * image handles. This extension does permit sampler and image data types to be used in more contexts than in unextended GLSL 4.00. In particular, sampler
 * and image types may be used as shader inputs/outputs, temporary variables, and uniform block members, and may be assigned to by shader code.
 * Constructors are provided to convert 64-bit unsigned integer values to and from sampler and image data types. Additionally, new APIs are provided to
 * load values for sampler and image uniforms with 64-bit handle inputs. The use of existing integer-based Uniform* APIs is still permitted, in which case
 * the integer specified will identify a texture image or image unit. For samplers and images with values specified as texture image or image units, the
 * GL implemenation will translate the unit number to an internal handle as required.</p>
 * 
 * <p>To access texture or image resources using handles, the handles must first be made resident. Accessing a texture or image by handle without first
 * making it resident can result in undefined results, including program termination. Since the amount of texture memory required by an application may
 * exceed the amount of memory available to the system, this extension provides API calls allowing applications to manage overall texture memory
 * consumption by making a texture resident and non-resident as required.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
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
		return checkFunctionality(GLES.getCapabilities().__NVBindlessTexture);
	}

	static NVBindlessTexture create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_NV_bindless_texture") ) return null;

		NVBindlessTexture funcs = new NVBindlessTexture(provider);
		boolean supported = checkFunctions(
			funcs.GetTextureHandleNV, funcs.GetTextureSamplerHandleNV, funcs.MakeTextureHandleResidentNV, funcs.MakeTextureHandleNonResidentNV, 
			funcs.GetImageHandleNV, funcs.MakeImageHandleResidentNV, funcs.MakeImageHandleNonResidentNV, funcs.UniformHandleui64NV, funcs.UniformHandleui64vNV, 
			funcs.ProgramUniformHandleui64NV, funcs.ProgramUniformHandleui64vNV, funcs.IsTextureHandleResidentNV, funcs.IsImageHandleResidentNV
		);

		return GLES.checkExtension("GL_NV_bindless_texture", funcs, supported);
	}

	// --- [ glGetTextureHandleNV ] ---

	public static long glGetTextureHandleNV(int texture) {
		long __functionAddress = getInstance().GetTextureHandleNV;
		return callIJ(__functionAddress, texture);
	}

	// --- [ glGetTextureSamplerHandleNV ] ---

	public static long glGetTextureSamplerHandleNV(int texture, int sampler) {
		long __functionAddress = getInstance().GetTextureSamplerHandleNV;
		return callIIJ(__functionAddress, texture, sampler);
	}

	// --- [ glMakeTextureHandleResidentNV ] ---

	public static void glMakeTextureHandleResidentNV(long handle) {
		long __functionAddress = getInstance().MakeTextureHandleResidentNV;
		callJV(__functionAddress, handle);
	}

	// --- [ glMakeTextureHandleNonResidentNV ] ---

	public static void glMakeTextureHandleNonResidentNV(long handle) {
		long __functionAddress = getInstance().MakeTextureHandleNonResidentNV;
		callJV(__functionAddress, handle);
	}

	// --- [ glGetImageHandleNV ] ---

	public static long glGetImageHandleNV(int texture, int level, boolean layered, int layer, int format) {
		long __functionAddress = getInstance().GetImageHandleNV;
		return callIIZIIJ(__functionAddress, texture, level, layered, layer, format);
	}

	// --- [ glMakeImageHandleResidentNV ] ---

	public static void glMakeImageHandleResidentNV(long handle, int access) {
		long __functionAddress = getInstance().MakeImageHandleResidentNV;
		callJIV(__functionAddress, handle, access);
	}

	// --- [ glMakeImageHandleNonResidentNV ] ---

	public static void glMakeImageHandleNonResidentNV(long handle) {
		long __functionAddress = getInstance().MakeImageHandleNonResidentNV;
		callJV(__functionAddress, handle);
	}

	// --- [ glUniformHandleui64NV ] ---

	public static void glUniformHandleui64NV(int location, long value) {
		long __functionAddress = getInstance().UniformHandleui64NV;
		callIJV(__functionAddress, location, value);
	}

	// --- [ glUniformHandleui64vNV ] ---

	/** Unsafe version of {@link #glUniformHandleui64vNV UniformHandleui64vNV} */
	@JavadocExclude
	public static void nglUniformHandleui64vNV(int location, int count, long values) {
		long __functionAddress = getInstance().UniformHandleui64vNV;
		callIIPV(__functionAddress, location, count, values);
	}

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

	public static void glProgramUniformHandleui64NV(int program, int location, long value) {
		long __functionAddress = getInstance().ProgramUniformHandleui64NV;
		callIIJV(__functionAddress, program, location, value);
	}

	// --- [ glProgramUniformHandleui64vNV ] ---

	/** Unsafe version of {@link #glProgramUniformHandleui64vNV ProgramUniformHandleui64vNV} */
	@JavadocExclude
	public static void nglProgramUniformHandleui64vNV(int program, int location, int count, long values) {
		long __functionAddress = getInstance().ProgramUniformHandleui64vNV;
		callIIIPV(__functionAddress, program, location, count, values);
	}

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

	public static boolean glIsTextureHandleResidentNV(long handle) {
		long __functionAddress = getInstance().IsTextureHandleResidentNV;
		return callJZ(__functionAddress, handle);
	}

	// --- [ glIsImageHandleResidentNV ] ---

	public static boolean glIsImageHandleResidentNV(long handle) {
		long __functionAddress = getInstance().IsImageHandleResidentNV;
		return callJZ(__functionAddress, handle);
	}

}