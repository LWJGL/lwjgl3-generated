/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import java.util.Set;

/** Defines the capabilities of an OpenCL context. */
public final class CLPlatformCapabilities {

	final CL10.Functions __CL10;
	final CL11.Functions __CL11;
	final CL12.Functions __CL12;

	/** Indicates whether an OpenCL functionality is available or not. */
	public final boolean
		OpenCL10,
		OpenCL11,
		OpenCL12,
		CL_KHR_icd;

	CLPlatformCapabilities(long platform, Set<String> ext) {
		FunctionProviderLocal provider = CL.getFunctionProvider();

		OpenCL10 = (__CL10 = CL10.create(ext, provider)) != null;
		OpenCL11 = (__CL11 = CL11.create(ext, provider)) != null;
		OpenCL12 = (__CL12 = CL12.create(ext, provider)) != null;
		CL_KHR_icd = ext.contains("CL_KHR_icd");
	}
}