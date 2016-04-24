/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/EXT/texture_filter_minmax.txt">EXT_texture_filter_minmax</a> extension.
 * 
 * <p>In unextended OpenGL 4.3, minification and magnification filters such as LINEAR allow texture lookups to returned a filtered texel value produced by
 * computing an weighted average of a collection of texels in the neighborhood of the texture coordinate provided.</p>
 * 
 * <p>This extension provides a new texture and sampler parameter (TEXTURE_REDUCTION_MODE_EXT) which allows applications to produce a filtered texel value by
 * computing a component-wise minimum (MIN) or maximum (MAX) of the texels that would normally be averaged. The reduction mode is orthogonal to the
 * minification and magnification filter parameters. The filter parameters are used to identify the set of texels used to produce a final filtered value;
 * the reduction mode identifies how these texels are combined.</p>
 */
public class EXTTextureFilterMinmax {

	/**
	 * Accepted by the {@code pname} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, GetSamplerParameter{i f}v, GetSamplerParameterI{u}iv,
	 * TexParameter{i f}{v}, TexParameterI{u}iv, GetTexParameter{i f}v, GetTexParameterI{u}iv, TextureParameter{i f}{v}EXT, TextureParameterI{u}ivEXT,
	 * GetTextureParameter{i f}vEXT, GetTextureParameterI{u}ivEXT, MultiTexParameter{i f}{v}EXT, MultiTexParameterI{u}ivEXT, GetMultiTexParameter{i f}vEXT, and
	 * GetMultiTexParameterI{u}ivEXT.
	 */
	public static final int GL_TEXTURE_REDUCTION_MODE_EXT = 0x9366;

	/**
	 * Accepted by the {@code param} or {@code params} parameter to SamplerParameter{i f}{v}, SamplerParameterI{u}iv, TexParameter{i f}{v}, TexParameterI{u}iv,
	 * TextureParameter{i f}{v}EXT, TextureParameterI{u}ivEXT, MultiTexParameter{i f}{v}EXT, or MultiTexParameterI{u}ivEXT when {@code pname} is
	 * TEXTURE_REDUCTION_MODE_EXT.
	 */
	public static final int GL_WEIGHTED_AVERAGE_EXT = 0x9367;

	protected EXTTextureFilterMinmax() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(GLESCapabilities caps) {
		return checkFunctions(
			caps.glRasterSamplesEXT
		);
	}

	// --- [ glRasterSamplesEXT ] ---

	public static void glRasterSamplesEXT(int samples, boolean fixedsamplelocations) {
		long __functionAddress = GLES.getCapabilities().glRasterSamplesEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callV(__functionAddress, samples, fixedsamplelocations);
	}

}