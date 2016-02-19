/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Due to the nature of the Vulkan interface, there is very little error information available to the developer/application. By enabling optional
 * validation layers and using the Debug Report extension a developer has much more detailed feedback on the application's use of Vulkan.
 * 
 * <p>This extension adds two entrypoints (vkCreateDebugReportCallbackEXT, vkDestroyDebugReportCallbackEXT) and an extension structure that together define a
 * way for layers and the implementation to call back to the application for events of interest to the application.</p>
 */
public class EXTDebugReport {

	/** The extension specification version. */
	public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 0x1;

	/** The extension name. */
	public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";

	/** VkStructureType */
	public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = 1000011000;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0x0;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 0x1;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 0x2;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 0x3;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 0x4;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 0x5;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 0x6;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 0x7;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 0x8;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 0x9;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 0xA;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 0xB;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 0xC;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 0xD;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 0xE;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 0xF;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 0x10;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 0x11;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 0x12;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 0x13;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 0x14;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 0x15;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 0x16;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 0x17;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 0x18;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 0x19;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 0x1A;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 0x1B;

	/**  */
	public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 0x1C;

	/**  */
	public static final int VK_DEBUG_REPORT_ERROR_NONE_EXT = 0x0;

	/**  */
	public static final int VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = 0x1;

	/**  */
	public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x1;

	/**  */
	public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x2;

	/**  */
	public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x4;

	/**  */
	public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x8;

	/**  */
	public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x10;

	/** Function address. */
	@JavadocExclude
	public final long
		CreateDebugReportCallbackEXT,
		DestroyDebugReportCallbackEXT,
		DebugReportMessageEXT;

	@JavadocExclude
	protected EXTDebugReport() {
		throw new UnsupportedOperationException();
	}

	@JavadocExclude
	public EXTDebugReport(FunctionProvider provider) {
		CreateDebugReportCallbackEXT = checkFunctionAddress(provider.getFunctionAddress("vkCreateDebugReportCallbackEXT"));
		DestroyDebugReportCallbackEXT = checkFunctionAddress(provider.getFunctionAddress("vkDestroyDebugReportCallbackEXT"));
		DebugReportMessageEXT = checkFunctionAddress(provider.getFunctionAddress("vkDebugReportMessageEXT"));
	}

	// --- [ Function Addresses ] ---

	private static final EXTDebugReport instance = new EXTDebugReport(getLibrary());

	/** Returns the {@link SharedLibrary} that provides pointers for the functions in this class. */
	public static SharedLibrary getLibrary() {
		return VK10.getLibrary();
	}

	/** Returns the {@link EXTDebugReport} instance. */
	public static EXTDebugReport getInstance() {
		return instance;
	}

	// --- [ vkCreateDebugReportCallbackEXT ] ---

	/** Unsafe version of {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
	@JavadocExclude
	public static int nvkCreateDebugReportCallbackEXT(long instance, long pCreateInfo, long pAllocator, long pCallback) {
		long __functionAddress = getInstance().CreateDebugReportCallbackEXT;
		if ( CHECKS )
			checkPointer(instance);
		return callPPPPI(__functionAddress, instance, pCreateInfo, pAllocator, pCallback);
	}

	public static int vkCreateDebugReportCallbackEXT(long instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, ByteBuffer pCallback) {
		if ( CHECKS )
			checkBuffer(pCallback, 1 << 3);
		return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCallback));
	}

	/** Alternative version of: {@link #vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} */
	public static int vkCreateDebugReportCallbackEXT(long instance, VkDebugReportCallbackCreateInfoEXT pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pCallback) {
		if ( CHECKS )
			checkBuffer(pCallback, 1);
		return nvkCreateDebugReportCallbackEXT(instance, pCreateInfo.address(), pAllocator == null ? NULL : pAllocator.address(), memAddress(pCallback));
	}

	// --- [ vkDestroyDebugReportCallbackEXT ] ---

	/** Unsafe version of {@link #vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT} */
	@JavadocExclude
	public static void nvkDestroyDebugReportCallbackEXT(long instance, long callback, long pAllocator) {
		long __functionAddress = getInstance().DestroyDebugReportCallbackEXT;
		if ( CHECKS )
			checkPointer(instance);
		callPJPV(__functionAddress, instance, callback, pAllocator);
	}

	public static void vkDestroyDebugReportCallbackEXT(long instance, long callback, VkAllocationCallbacks pAllocator) {
		nvkDestroyDebugReportCallbackEXT(instance, callback, pAllocator == null ? NULL : pAllocator.address());
	}

	// --- [ vkDebugReportMessageEXT ] ---

	/** Unsafe version of {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
	@JavadocExclude
	public static void nvkDebugReportMessageEXT(long instance, int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage) {
		long __functionAddress = getInstance().DebugReportMessageEXT;
		if ( CHECKS )
			checkPointer(instance);
		callPIIJPIPPV(__functionAddress, instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
	}

	public static void vkDebugReportMessageEXT(long instance, int flags, int objectType, long object, long location, int messageCode, ByteBuffer pLayerPrefix, ByteBuffer pMessage) {
		if ( CHECKS ) {
			checkNT1(pLayerPrefix);
			checkNT1(pMessage);
		}
		nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, memAddress(pLayerPrefix), memAddress(pMessage));
	}

	/** CharSequence version of: {@link #vkDebugReportMessageEXT DebugReportMessageEXT} */
	public static void vkDebugReportMessageEXT(long instance, int flags, int objectType, long object, long location, int messageCode, CharSequence pLayerPrefix, CharSequence pMessage) {
		APIBuffer __buffer = apiBuffer();
		int pLayerPrefixEncoded = __buffer.stringParamUTF8(pLayerPrefix, true);
		int pMessageEncoded = __buffer.stringParamUTF8(pMessage, true);
		nvkDebugReportMessageEXT(instance, flags, objectType, object, location, messageCode, __buffer.address(pLayerPrefixEncoded), __buffer.address(pMessageEncoded));
	}

}