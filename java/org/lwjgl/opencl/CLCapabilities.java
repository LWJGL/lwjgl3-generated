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

	final CL10.Functions                    __CL10;
	final CL10GL.Functions                  __CL10GL;
	final CL11.Functions                    __CL11;
	final CL12.Functions                    __CL12;
	final CL12GL.Functions                  __CL12GL;
	final AMDBusAddressableMemory.Functions __AMDBusAddressableMemory;
	final APPLEGLSharing.Functions          __APPLEGLSharing;
	final KHRGLEvent.Functions              __KHRGLEvent;
	final KHRGLSharing.Functions            __KHRGLSharing;
	final KHRTerminateContext.Functions     __KHRTerminateContext;

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
		cl_amd_bus_addressable_memory,
		cl_amd_compile_options,
		cl_amd_device_attribute_query,
		cl_amd_device_board_name,
		cl_amd_device_persistent_memory,
		cl_amd_device_profiling_timer_offset,
		cl_amd_device_topology,
		cl_amd_event_callback,
		cl_amd_fp64,
		cl_amd_media_ops,
		cl_amd_media_ops2,
		cl_amd_offline_devices,
		cl_amd_popcnt,
		cl_amd_predefined_macros,
		cl_amd_printf,
		cl_amd_vec3,
		cl_apple_gl_sharing,
		cl_intel_printf,
		cl_khr_3d_image_writes,
		cl_khr_byte_addressable_store,
		cl_khr_depth_images,
		cl_khr_fp16,
		cl_khr_fp64,
		cl_khr_gl_depth_images,
		cl_khr_gl_event,
		cl_khr_gl_msaa_sharing,
		cl_khr_gl_sharing,
		cl_khr_global_int32_base_atomics,
		cl_khr_global_int32_extended_atomics,
		cl_khr_icd,
		cl_khr_image2d_from_buffer,
		cl_khr_initialize_memory,
		cl_khr_int64_base_atomics,
		cl_khr_int64_extended_atomics,
		cl_khr_local_int32_base_atomics,
		cl_khr_local_int32_extended_atomics,
		cl_khr_select_fprounding_mode,
		cl_khr_spir,
		cl_khr_terminate_context,
		cl_nv_compiler_options,
		cl_nv_pragma_unroll;

	CLCapabilities(long platform, int majorVersion, int minorVersion, Set<String> ext) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;

		FunctionProviderLocal provider = CL.getFunctionProvider();

		OpenCL10 = (__CL10 = CL10.create(ext, provider)) != null;
		OpenCL10GL = (__CL10GL = CL10GL.create(ext, provider)) != null;
		OpenCL11 = (__CL11 = CL11.create(ext, provider)) != null;
		OpenCL12 = (__CL12 = CL12.create(ext, provider)) != null;
		OpenCL12GL = (__CL12GL = CL12GL.create(ext, provider)) != null;
		cl_amd_bus_addressable_memory = (__AMDBusAddressableMemory = AMDBusAddressableMemory.create(ext, provider, platform)) != null;
		cl_amd_compile_options = ext.contains("cl_amd_compile_options");
		cl_amd_device_attribute_query = ext.contains("cl_amd_device_attribute_query");
		cl_amd_device_board_name = ext.contains("cl_amd_device_board_name");
		cl_amd_device_persistent_memory = ext.contains("cl_amd_device_persistent_memory");
		cl_amd_device_profiling_timer_offset = ext.contains("cl_amd_device_profiling_timer_offset");
		cl_amd_device_topology = ext.contains("cl_amd_device_topology");
		cl_amd_event_callback = ext.contains("cl_amd_event_callback");
		cl_amd_fp64 = ext.contains("cl_amd_fp64");
		cl_amd_media_ops = ext.contains("cl_amd_media_ops");
		cl_amd_media_ops2 = ext.contains("cl_amd_media_ops2");
		cl_amd_offline_devices = ext.contains("cl_amd_offline_devices");
		cl_amd_popcnt = ext.contains("cl_amd_popcnt");
		cl_amd_predefined_macros = ext.contains("cl_amd_predefined_macros");
		cl_amd_printf = ext.contains("cl_amd_printf");
		cl_amd_vec3 = ext.contains("cl_amd_vec3");
		cl_apple_gl_sharing = (__APPLEGLSharing = APPLEGLSharing.create(ext, provider, platform)) != null;
		cl_intel_printf = ext.contains("cl_intel_printf");
		cl_khr_3d_image_writes = ext.contains("cl_khr_3d_image_writes");
		cl_khr_byte_addressable_store = ext.contains("cl_khr_byte_addressable_store");
		cl_khr_depth_images = ext.contains("cl_khr_depth_images");
		cl_khr_fp16 = ext.contains("cl_khr_fp16");
		cl_khr_fp64 = ext.contains("cl_khr_fp64");
		cl_khr_gl_depth_images = ext.contains("cl_khr_gl_depth_images");
		cl_khr_gl_event = (__KHRGLEvent = KHRGLEvent.create(ext, provider, platform)) != null;
		cl_khr_gl_msaa_sharing = ext.contains("cl_khr_gl_msaa_sharing");
		cl_khr_gl_sharing = (__KHRGLSharing = KHRGLSharing.create(ext, provider, platform)) != null;
		cl_khr_global_int32_base_atomics = ext.contains("cl_khr_global_int32_base_atomics");
		cl_khr_global_int32_extended_atomics = ext.contains("cl_khr_global_int32_extended_atomics");
		cl_khr_icd = ext.contains("cl_khr_icd");
		cl_khr_image2d_from_buffer = ext.contains("cl_khr_image2d_from_buffer");
		cl_khr_initialize_memory = ext.contains("cl_khr_initialize_memory");
		cl_khr_int64_base_atomics = ext.contains("cl_khr_int64_base_atomics");
		cl_khr_int64_extended_atomics = ext.contains("cl_khr_int64_extended_atomics");
		cl_khr_local_int32_base_atomics = ext.contains("cl_khr_local_int32_base_atomics");
		cl_khr_local_int32_extended_atomics = ext.contains("cl_khr_local_int32_extended_atomics");
		cl_khr_select_fprounding_mode = ext.contains("cl_khr_select_fprounding_mode");
		cl_khr_spir = ext.contains("cl_khr_spir");
		cl_khr_terminate_context = (__KHRTerminateContext = KHRTerminateContext.create(ext, provider, platform)) != null;
		cl_nv_compiler_options = ext.contains("cl_nv_compiler_options");
		cl_nv_pragma_unroll = ext.contains("cl_nv_pragma_unroll");
	}

	CLCapabilities(int majorVersion, int minorVersion, Set<String> ext, CLPlatform platform) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
		CLCapabilities caps = platform.getCapabilities();

		OpenCL10 = (__CL10 = ext.contains("OpenCL10") ? caps.__CL10 : null) != null;
		OpenCL10GL = (__CL10GL = ext.contains("OpenCL10GL") ? caps.__CL10GL : null) != null;
		OpenCL11 = (__CL11 = ext.contains("OpenCL11") ? caps.__CL11 : null) != null;
		OpenCL12 = (__CL12 = ext.contains("OpenCL12") ? caps.__CL12 : null) != null;
		OpenCL12GL = (__CL12GL = ext.contains("OpenCL12GL") ? caps.__CL12GL : null) != null;
		cl_amd_bus_addressable_memory = (__AMDBusAddressableMemory = ext.contains("cl_amd_bus_addressable_memory") ? caps.__AMDBusAddressableMemory : null) != null;
		cl_amd_compile_options = ext.contains("cl_amd_compile_options");
		cl_amd_device_attribute_query = ext.contains("cl_amd_device_attribute_query");
		cl_amd_device_board_name = ext.contains("cl_amd_device_board_name");
		cl_amd_device_persistent_memory = ext.contains("cl_amd_device_persistent_memory");
		cl_amd_device_profiling_timer_offset = ext.contains("cl_amd_device_profiling_timer_offset");
		cl_amd_device_topology = ext.contains("cl_amd_device_topology");
		cl_amd_event_callback = ext.contains("cl_amd_event_callback");
		cl_amd_fp64 = ext.contains("cl_amd_fp64");
		cl_amd_media_ops = ext.contains("cl_amd_media_ops");
		cl_amd_media_ops2 = ext.contains("cl_amd_media_ops2");
		cl_amd_offline_devices = ext.contains("cl_amd_offline_devices");
		cl_amd_popcnt = ext.contains("cl_amd_popcnt");
		cl_amd_predefined_macros = ext.contains("cl_amd_predefined_macros");
		cl_amd_printf = ext.contains("cl_amd_printf");
		cl_amd_vec3 = ext.contains("cl_amd_vec3");
		cl_apple_gl_sharing = (__APPLEGLSharing = ext.contains("cl_apple_gl_sharing") ? caps.__APPLEGLSharing : null) != null;
		cl_intel_printf = ext.contains("cl_intel_printf");
		cl_khr_3d_image_writes = ext.contains("cl_khr_3d_image_writes");
		cl_khr_byte_addressable_store = ext.contains("cl_khr_byte_addressable_store");
		cl_khr_depth_images = ext.contains("cl_khr_depth_images");
		cl_khr_fp16 = ext.contains("cl_khr_fp16");
		cl_khr_fp64 = ext.contains("cl_khr_fp64");
		cl_khr_gl_depth_images = ext.contains("cl_khr_gl_depth_images");
		cl_khr_gl_event = (__KHRGLEvent = ext.contains("cl_khr_gl_event") ? caps.__KHRGLEvent : null) != null;
		cl_khr_gl_msaa_sharing = ext.contains("cl_khr_gl_msaa_sharing");
		cl_khr_gl_sharing = (__KHRGLSharing = ext.contains("cl_khr_gl_sharing") ? caps.__KHRGLSharing : null) != null;
		cl_khr_global_int32_base_atomics = ext.contains("cl_khr_global_int32_base_atomics");
		cl_khr_global_int32_extended_atomics = ext.contains("cl_khr_global_int32_extended_atomics");
		cl_khr_icd = ext.contains("cl_khr_icd");
		cl_khr_image2d_from_buffer = ext.contains("cl_khr_image2d_from_buffer");
		cl_khr_initialize_memory = ext.contains("cl_khr_initialize_memory");
		cl_khr_int64_base_atomics = ext.contains("cl_khr_int64_base_atomics");
		cl_khr_int64_extended_atomics = ext.contains("cl_khr_int64_extended_atomics");
		cl_khr_local_int32_base_atomics = ext.contains("cl_khr_local_int32_base_atomics");
		cl_khr_local_int32_extended_atomics = ext.contains("cl_khr_local_int32_extended_atomics");
		cl_khr_select_fprounding_mode = ext.contains("cl_khr_select_fprounding_mode");
		cl_khr_spir = ext.contains("cl_khr_spir");
		cl_khr_terminate_context = (__KHRTerminateContext = ext.contains("cl_khr_terminate_context") ? caps.__KHRTerminateContext : null) != null;
		cl_nv_compiler_options = ext.contains("cl_nv_compiler_options");
		cl_nv_pragma_unroll = ext.contains("cl_nv_pragma_unroll");
	}

	public String toString() {
		StringBuilder buf = new StringBuilder(512);

		buf.append("OpenCL ").append(majorVersion).append('.').append(minorVersion);
		buf.append(" - Extensions: ");

		if ( cl_amd_bus_addressable_memory ) buf.append("cl_amd_bus_addressable_memory ");
		if ( cl_amd_compile_options ) buf.append("cl_amd_compile_options ");
		if ( cl_amd_device_attribute_query ) buf.append("cl_amd_device_attribute_query ");
		if ( cl_amd_device_board_name ) buf.append("cl_amd_device_board_name ");
		if ( cl_amd_device_persistent_memory ) buf.append("cl_amd_device_persistent_memory ");
		if ( cl_amd_device_profiling_timer_offset ) buf.append("cl_amd_device_profiling_timer_offset ");
		if ( cl_amd_device_topology ) buf.append("cl_amd_device_topology ");
		if ( cl_amd_event_callback ) buf.append("cl_amd_event_callback ");
		if ( cl_amd_fp64 ) buf.append("cl_amd_fp64 ");
		if ( cl_amd_media_ops ) buf.append("cl_amd_media_ops ");
		if ( cl_amd_media_ops2 ) buf.append("cl_amd_media_ops2 ");
		if ( cl_amd_offline_devices ) buf.append("cl_amd_offline_devices ");
		if ( cl_amd_popcnt ) buf.append("cl_amd_popcnt ");
		if ( cl_amd_predefined_macros ) buf.append("cl_amd_predefined_macros ");
		if ( cl_amd_printf ) buf.append("cl_amd_printf ");
		if ( cl_amd_vec3 ) buf.append("cl_amd_vec3 ");
		if ( cl_apple_gl_sharing ) buf.append("cl_apple_gl_sharing ");
		if ( cl_intel_printf ) buf.append("cl_intel_printf ");
		if ( cl_khr_3d_image_writes ) buf.append("cl_khr_3d_image_writes ");
		if ( cl_khr_byte_addressable_store ) buf.append("cl_khr_byte_addressable_store ");
		if ( cl_khr_depth_images ) buf.append("cl_khr_depth_images ");
		if ( cl_khr_fp16 ) buf.append("cl_khr_fp16 ");
		if ( cl_khr_fp64 ) buf.append("cl_khr_fp64 ");
		if ( cl_khr_gl_depth_images ) buf.append("cl_khr_gl_depth_images ");
		if ( cl_khr_gl_event ) buf.append("cl_khr_gl_event ");
		if ( cl_khr_gl_msaa_sharing ) buf.append("cl_khr_gl_msaa_sharing ");
		if ( cl_khr_gl_sharing ) buf.append("cl_khr_gl_sharing ");
		if ( cl_khr_global_int32_base_atomics ) buf.append("cl_khr_global_int32_base_atomics ");
		if ( cl_khr_global_int32_extended_atomics ) buf.append("cl_khr_global_int32_extended_atomics ");
		if ( cl_khr_icd ) buf.append("cl_khr_icd ");
		if ( cl_khr_image2d_from_buffer ) buf.append("cl_khr_image2d_from_buffer ");
		if ( cl_khr_initialize_memory ) buf.append("cl_khr_initialize_memory ");
		if ( cl_khr_int64_base_atomics ) buf.append("cl_khr_int64_base_atomics ");
		if ( cl_khr_int64_extended_atomics ) buf.append("cl_khr_int64_extended_atomics ");
		if ( cl_khr_local_int32_base_atomics ) buf.append("cl_khr_local_int32_base_atomics ");
		if ( cl_khr_local_int32_extended_atomics ) buf.append("cl_khr_local_int32_extended_atomics ");
		if ( cl_khr_select_fprounding_mode ) buf.append("cl_khr_select_fprounding_mode ");
		if ( cl_khr_spir ) buf.append("cl_khr_spir ");
		if ( cl_khr_terminate_context ) buf.append("cl_khr_terminate_context ");
		if ( cl_nv_compiler_options ) buf.append("cl_nv_compiler_options ");
		if ( cl_nv_pragma_unroll ) buf.append("cl_nv_pragma_unroll ");

		return buf.toString();
	}


}