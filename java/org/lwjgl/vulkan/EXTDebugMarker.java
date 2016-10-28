/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The {@code VK_EXT_debug_marker} extension is a device extension. It introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording annotations of named sections of a workload to aid organisation and offline analysis in external tools. */
public class EXTDebugMarker {

	/** The extension specification version. */
	public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 3;

	/** The extension name. */
	public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000,
		VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT  = 1000022001,
		VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT      = 1000022002;

	protected EXTDebugMarker() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkDebugMarkerSetObjectTagEXT, caps.vkDebugMarkerSetObjectNameEXT, caps.vkCmdDebugMarkerBeginEXT, caps.vkCmdDebugMarkerEndEXT, 
			caps.vkCmdDebugMarkerInsertEXT
		);
	}

	// --- [ vkDebugMarkerSetObjectTagEXT ] ---

	/** Unsafe version of: {@link #vkDebugMarkerSetObjectTagEXT DebugMarkerSetObjectTagEXT} */
	public static int nvkDebugMarkerSetObjectTagEXT(VkDevice device, long pTagInfo) {
		long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectTagEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerObjectTagInfoEXT.validate(pTagInfo);
		}
		return callPPI(__functionAddress, device.address(), pTagInfo);
	}

	/**
	 * Attach arbitrary data to an object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader tracing. To attach data to an object, call:</p>
	 * 
	 * <pre><code>VkResult vkDebugMarkerSetObjectTagEXT(
    VkDevice                                    device,
    VkDebugMarkerObjectTagInfoEXT*              pTagInfo);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code pTagInfo.object} <b>must</b> be a Vulkan object</li>
	 * <li>{@code pTagInfo.tagName} <b>must</b> not be 0</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pTagInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectTagInfoEXT} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pTagInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDebugMarkerObjectTagInfoEXT}</p>
	 *
	 * @param device   the device that created the object.
	 * @param pTagInfo a pointer to an instance of the {@link VkDebugMarkerObjectTagInfoEXT} structure specifying the parameters of the tag to attach to the object.
	 */
	public static int vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo) {
		return nvkDebugMarkerSetObjectTagEXT(device, pTagInfo.address());
	}

	// --- [ vkDebugMarkerSetObjectNameEXT ] ---

	/** Unsafe version of: {@link #vkDebugMarkerSetObjectNameEXT DebugMarkerSetObjectNameEXT} */
	public static int nvkDebugMarkerSetObjectNameEXT(VkDevice device, long pNameInfo) {
		long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectNameEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerObjectNameInfoEXT.validate(pNameInfo);
		}
		return callPPI(__functionAddress, device.address(), pNameInfo);
	}

	/**
	 * Give a user-friendly name to an object.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>An object can be given a user-friendly name by calling:</p>
	 * 
	 * <pre><code>VkResult vkDebugMarkerSetObjectNameEXT(
    VkDevice                                    device,
    VkDebugMarkerObjectNameInfoEXT*             pNameInfo);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code pNameInfo.object} <b>must</b> be a Vulkan object</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pNameInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectNameInfoEXT} structure</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pNameInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Return Codes</h5>
	 * 
	 * <dl>
	 * <dt>On success, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
	 * </ul></dd>
	 * <dt>On failure, this command returns</dt>
	 * <dd><ul>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
	 * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
	 * </ul></dd>
	 * </dl>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDebugMarkerObjectNameInfoEXT}</p>
	 *
	 * @param device    the device that created the object.
	 * @param pNameInfo a pointer to an instance of the {@link VkDebugMarkerObjectNameInfoEXT} structure specifying the parameters of the name to set on the object.
	 */
	public static int vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo) {
		return nvkDebugMarkerSetObjectNameEXT(device, pNameInfo.address());
	}

	// --- [ vkCmdDebugMarkerBeginEXT ] ---

	/** Unsafe version of: {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} */
	public static void nvkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerBeginEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
		}
		callPPV(__functionAddress, commandBuffer.address(), pMarkerInfo);
	}

	/**
	 * Open a command buffer marker region.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A marker region can be opened by calling:</p>
	 * 
	 * <pre><code>void vkCmdDebugMarkerBeginEXT(
    VkCommandBuffer                             commandBuffer,
    VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDebugMarkerMarkerInfoEXT}</p>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker region to open.
	 */
	public static void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
		nvkCmdDebugMarkerBeginEXT(commandBuffer, pMarkerInfo.address());
	}

	// --- [ vkCmdDebugMarkerEndEXT ] ---

	/**
	 * Close a command buffer marker region.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A marker region can be closed by calling:</p>
	 * 
	 * <pre><code>void vkCmdDebugMarkerEndEXT(
    VkCommandBuffer                             commandBuffer);</code></pre>
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} and {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} <b>must</b> be matched and balanced.</p>
	 * 
	 * <p>Any calls to {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} within a secondary command buffer must have a matching {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} in that same command buffer, and marker regions begun outside of the secondary command buffer must not be ended inside it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>There <b>must</b> be an outstanding {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command prior to the {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} on the queue that {@code commandBuffer} is submitted to</li>
	 * <li>If the matching {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command was in a secondary command buffer, the {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} must be in the same {@code commandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 */
	public static void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerEndEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, commandBuffer.address());
	}

	// --- [ vkCmdDebugMarkerInsertEXT ] ---

	/** Unsafe version of: {@link #vkCmdDebugMarkerInsertEXT CmdDebugMarkerInsertEXT} */
	public static void nvkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerInsertEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
		}
		callPPV(__functionAddress, commandBuffer.address(), pMarkerInfo);
	}

	/**
	 * Insert a marker label into a command buffer.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>A single marker label can be inserted into a command buffer by calling:</p>
	 * 
	 * <pre><code>void vkCmdDebugMarkerInsertEXT(
    VkCommandBuffer                             commandBuffer,
    VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDebugMarkerMarkerInfoEXT}</p>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded.
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker to insert.
	 */
	public static void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
		nvkCmdDebugMarkerInsertEXT(commandBuffer, pMarkerInfo.address());
	}

}