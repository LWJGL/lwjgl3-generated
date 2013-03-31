/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import java.util.Set;

/** Defines the capabilities of an OpenCL platform. */
/**
 * Defines the capabilities of an OpenCL platform or device.
 * <p/>
 * The instance returned by {@link CLPlatform#getCapabilities()} )} exposes the functionality present on either the platform or any of its devices. This is
 * unlike the {@link CL10#CL_PLATFORM_EXTENSIONS} string, which returns only platform functionality, supported across all platform devices.
 * <p/>
 * The instance returned by {@link CLDevice#getCapabilities()} exposes only the functionality available on that particular device.
 * <p/>
 * The instance returned by any other OpenCL object will be the instance of its parent object.
 */
public class CLCapabilities {

	final CL10.Functions           __CL10;
	final CL10GL.Functions         __CL10GL;
	final CL11.Functions           __CL11;
	final CL12.Functions           __CL12;
	final CL12GL.Functions         __CL12GL;
	final APPLEGLSharing.Functions __APPLEGLSharing;
	final KHRGLSharing.Functions   __KHRGLSharing;

	/** The OpenCL major version. */
	public final int majorVersion;

	/** The OpenCL minor version. */
	public final int minorVersion;


	/** Indicates whether an OpenCL functionality is available or not. */
	public final boolean
		OpenCL10,
		OpenCL10GL,
		OpenCL11,
		OpenCL12,
		OpenCL12GL,
		CL_apple_gl_sharing,
		CL_khr_gl_sharing,
		CL_khr_icd;

	CLCapabilities(long platform, int majorVersion, int minorVersion, Set<String> ext) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		FunctionProviderLocal provider = CL.getFunctionProvider();

		OpenCL10 = (__CL10 = CL10.create(ext, provider)) != null;
		OpenCL10GL = (__CL10GL = CL10GL.create(ext, provider)) != null;
		OpenCL11 = (__CL11 = CL11.create(ext, provider)) != null;
		OpenCL12 = (__CL12 = CL12.create(ext, provider)) != null;
		OpenCL12GL = (__CL12GL = CL12GL.create(ext, provider)) != null;
		CL_apple_gl_sharing = (__APPLEGLSharing = APPLEGLSharing.create(ext, provider, platform)) != null;
		CL_khr_gl_sharing = (__KHRGLSharing = KHRGLSharing.create(ext, provider, platform)) != null;
		CL_khr_icd = ext.contains("cl_khr_icd");
	}

	CLCapabilities(int majorVersion, int minorVersion, Set<String> ext, CLPlatform platform) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		CLCapabilities caps = platform.getCapabilities();

		OpenCL10 = (__CL10 = ext.contains("opencl10") ? caps.__CL10 : null) != null;
		OpenCL10GL = (__CL10GL = ext.contains("opencl10gl") ? caps.__CL10GL : null) != null;
		OpenCL11 = (__CL11 = ext.contains("opencl11") ? caps.__CL11 : null) != null;
		OpenCL12 = (__CL12 = ext.contains("opencl12") ? caps.__CL12 : null) != null;
		OpenCL12GL = (__CL12GL = ext.contains("opencl12gl") ? caps.__CL12GL : null) != null;
		CL_apple_gl_sharing = (__APPLEGLSharing = ext.contains("cl_apple_gl_sharing") ? caps.__APPLEGLSharing : null) != null;
		CL_khr_gl_sharing = (__KHRGLSharing = ext.contains("cl_khr_gl_sharing") ? caps.__KHRGLSharing : null) != null;
		CL_khr_icd = ext.contains("cl_khr_icd");
	}

	public String toString() {
		StringBuilder buf = new StringBuilder(512);

		buf.append("OpenCL ").append(majorVersion).append('.').append(minorVersion);
		buf.append(" - Extensions: ");

		if ( CL_apple_gl_sharing ) buf.append("cl_apple_gl_sharing ");
		if ( CL_khr_gl_sharing ) buf.append("cl_khr_gl_sharing ");
		if ( CL_khr_icd ) buf.append("cl_khr_icd ");

		return buf.toString();
	}


}