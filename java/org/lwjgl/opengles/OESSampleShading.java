/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_sample_shading.txt">OES_sample_shading</a> extension.
 * 
 * <p>In standard multisample rendering, an implementation is allowed to assign the same sets of fragment shader input values to each sample. This can cause
 * aliasing where the fragment shader input values are used to generate a result that doesn't antialias itself, for example with alpha-tested
 * transparency.</p>
 * 
 * <p>This extension adds the ability to explicitly request that an implementation use a minimum number of unique set of fragment computation inputs when
 * multisampling a pixel. Specifying such a requirement can reduce aliasing that results from evaluating the fragment computations too few times per
 * pixel.</p>
 * 
 * <p>This extension adds new global state that controls the minimum number of samples for which attribute data is independently interpolated. When enabled,
 * all fragment-shading operations are executed independently on each sample.</p>
 * 
 * <p>Requires {@link GLES30 GLES E.S}.</p>
 */
public final class OESSampleShading {

	/**
	 * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
	 * GetInteger64v.
	 */
	public static final int GL_SAMPLE_SHADING_OES = 0x8C36;

	/** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, and GetFloatv. */
	public static final int GL_MIN_SAMPLE_SHADING_VALUE_OES = 0x8C37;

	/** Function address. */
	@JavadocExclude
	public final long MinSampleShadingOES;

	@JavadocExclude
	public OESSampleShading(FunctionProvider provider) {
		MinSampleShadingOES = provider.getFunctionAddress("glMinSampleShadingOES");
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link OESSampleShading} instance for the current context. */
	public static OESSampleShading getInstance() {
		return checkFunctionality(GLES.getCapabilities().__OESSampleShading);
	}

	static OESSampleShading create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("GL_OES_sample_shading") ) return null;

		OESSampleShading funcs = new OESSampleShading(provider);
		boolean supported = checkFunctions(
			funcs.MinSampleShadingOES
		);

		return GLES.checkExtension("GL_OES_sample_shading", funcs, supported);
	}

	// --- [ glMinSampleShadingOES ] ---

	public static void glMinSampleShadingOES(float value) {
		long __functionAddress = getInstance().MinSampleShadingOES;
		callFV(__functionAddress, value);
	}

}