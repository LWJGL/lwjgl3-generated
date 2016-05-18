/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording
 * annotations of named sections of a workload to aid organisation and offline analysis in external tools.
 * 
 * <p>The {@code VK_EXT_debug_marker} extension is a device extension.</p>
 * 
 * <p>Given the complexity of Vulkan there is a strong need for verbose debugging information to aid the application developer in tracking down errors in the
 * application's use of Vulkan, particularly in combination with an external debugger or profiler.</p>
 * 
 * <p>Object Annotation allows the application to associate a name or binary data with a Vulkan object, while command buffer markers provide the developer
 * with a way of associating logical elements of the scene with commands in the command buffer.</p>
 */
public class EXTDebugMarker {

	/** The extension specification version. */
	public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 3;

	/** The extension name. */
	public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";

	/** VkStructureType */
	public static final int
		VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000,
		VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT  = 1000022001,
		VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT      = 1000022002;

	protected EXTDebugMarker() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkDebugMarkerSetObjectNameEXT, caps.vkDebugMarkerSetObjectTagEXT, caps.vkCmdDebugMarkerBeginEXT, caps.vkCmdDebugMarkerEndEXT, 
			caps.vkCmdDebugMarkerInsertEXT
		);
	}

	// --- [ vkDebugMarkerSetObjectNameEXT ] ---

	/**
	 * Gives a user-friendly name to a Vulkan object.
	 * 
	 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@code vkDebugMarkerSetObjectNameEXT} again with a new string. To remove
	 * a previously set name, {@code pName} should be set to an empty string.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pNameInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectNameInfoEXT} structure</li>
	 * <li>{@code pNameInfo.object} <b>must</b> be a Vulkan object</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pNameInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device    the device that created the object
	 * @param pNameInfo a pointer to an instance of the {@link VkDebugMarkerObjectNameInfoEXT} structure specifying the parameters of the name to set on the object
	 */
	public static int nvkDebugMarkerSetObjectNameEXT(VkDevice device, long pNameInfo) {
		long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectNameEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		return callPPI(__functionAddress, device.address(), pNameInfo);
	}

	/**
	 * Gives a user-friendly name to a Vulkan object.
	 * 
	 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@code vkDebugMarkerSetObjectNameEXT} again with a new string. To remove
	 * a previously set name, {@code pName} should be set to an empty string.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pNameInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectNameInfoEXT} structure</li>
	 * <li>{@code pNameInfo.object} <b>must</b> be a Vulkan object</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pNameInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device    the device that created the object
	 * @param pNameInfo a pointer to an instance of the {@link VkDebugMarkerObjectNameInfoEXT} structure specifying the parameters of the name to set on the object
	 */
	public static int vkDebugMarkerSetObjectNameEXT(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo) {
		return nvkDebugMarkerSetObjectNameEXT(device, pNameInfo.address());
	}

	// --- [ vkDebugMarkerSetObjectTagEXT ] ---

	/**
	 * Attaches arbitrary data to a Vulkan object.
	 * 
	 * <p>In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no
	 * other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader
	 * tracing.</p>
	 * 
	 * <p>The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for
	 * only data that can be used by that implementation.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pTagInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectTagInfoEXT} structure</li>
	 * <li>{@code pTagInfo.object} <b>must</b> be a Vulkan object</li>
	 * <li>{@code pTagInfo.tagName} <b>must not</b> be 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pTagInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device   the device that created the object
	 * @param pTagInfo a pointer to an instance of the {@link VkDebugMarkerObjectTagInfoEXT} structure specifying the parameters of the tag to attach to the object
	 */
	public static int nvkDebugMarkerSetObjectTagEXT(VkDevice device, long pTagInfo) {
		long __functionAddress = device.getCapabilities().vkDebugMarkerSetObjectTagEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerObjectTagInfoEXT.validate(pTagInfo);
		}
		return callPPI(__functionAddress, device.address(), pTagInfo);
	}

	/**
	 * Attaches arbitrary data to a Vulkan object.
	 * 
	 * <p>In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no
	 * other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader
	 * tracing.</p>
	 * 
	 * <p>The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for
	 * only data that can be used by that implementation.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pTagInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerObjectTagInfoEXT} structure</li>
	 * <li>{@code pTagInfo.object} <b>must</b> be a Vulkan object</li>
	 * <li>{@code pTagInfo.tagName} <b>must not</b> be 0</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code pTagInfo.object} <b>must</b> be externally synchronized</li>
	 * </ul>
	 *
	 * @param device   the device that created the object
	 * @param pTagInfo a pointer to an instance of the {@link VkDebugMarkerObjectTagInfoEXT} structure specifying the parameters of the tag to attach to the object
	 */
	public static int vkDebugMarkerSetObjectTagEXT(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo) {
		return nvkDebugMarkerSetObjectTagEXT(device, pTagInfo.address());
	}

	// --- [ vkCmdDebugMarkerBeginEXT ] ---

	/**
	 * Opens a marker region.
	 * 
	 * <p>Typical Vulkan applications will submit many command buffers in each frame, with each command buffer containing a large number of individual commands.
	 * Being able to logically annotate regions of command buffers that belong together as well as hierarchically subdivide the frame is important to a
	 * developer's ability to navigate the commands viewed holistically.</p>
	 * 
	 * <p>An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command
	 * buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to
	 * {@code vkCmdDebugMarkerBeginEXT} and {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} <b>must</b> be matched and balanced.</p>
	 * 
	 * <p>Any calls to {@code vkCmdDebugMarkerBeginEXT} within a secondary command buffer must have a matching {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} in that same command
	 * buffer, and marker regions begun outside of the secondary command buffer must not be ended inside it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker region to open
	 */
	public static void nvkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerBeginEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
		}
		callPPV(__functionAddress, commandBuffer.address(), pMarkerInfo);
	}

	/**
	 * Opens a marker region.
	 * 
	 * <p>Typical Vulkan applications will submit many command buffers in each frame, with each command buffer containing a large number of individual commands.
	 * Being able to logically annotate regions of command buffers that belong together as well as hierarchically subdivide the frame is important to a
	 * developer's ability to navigate the commands viewed holistically.</p>
	 * 
	 * <p>An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command
	 * buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to
	 * {@code vkCmdDebugMarkerBeginEXT} and {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} <b>must</b> be matched and balanced.</p>
	 * 
	 * <p>Any calls to {@code vkCmdDebugMarkerBeginEXT} within a secondary command buffer must have a matching {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} in that same command
	 * buffer, and marker regions begun outside of the secondary command buffer must not be ended inside it.</p>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker region to open
	 */
	public static void vkCmdDebugMarkerBeginEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
		nvkCmdDebugMarkerBeginEXT(commandBuffer, pMarkerInfo.address());
	}

	// --- [ vkCmdDebugMarkerEndEXT ] ---

	/**
	 * Closes a marker region.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * <li>There <b>must</b> be an outstanding {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command prior to the {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} on the queue that {@code commandBuffer} is
	 * submitted to.</li>
	 * <li>If the matching {@link #vkCmdDebugMarkerBeginEXT CmdDebugMarkerBeginEXT} command was in a secondary command buffer, the {@link #vkCmdDebugMarkerEndEXT CmdDebugMarkerEndEXT} must be in the same
	 * {@code commandBuffer}.</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer handle
	 */
	public static void vkCmdDebugMarkerEndEXT(VkCommandBuffer commandBuffer) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerEndEXT;
		if ( CHECKS )
			checkFunctionAddress(__functionAddress);
		callPV(__functionAddress, commandBuffer.address());
	}

	// --- [ vkCmdDebugMarkerInsertEXT ] ---

	/**
	 * Inserts a single marker label into a command buffer.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker to insert
	 */
	public static void nvkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, long pMarkerInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdDebugMarkerInsertEXT;
		if ( CHECKS ) {
			checkFunctionAddress(__functionAddress);
			VkDebugMarkerMarkerInfoEXT.validate(pMarkerInfo);
		}
		callPPV(__functionAddress, commandBuffer.address(), pMarkerInfo);
	}

	/**
	 * Inserts a single marker label into a command buffer.
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pMarkerInfo} <b>must</b> be a pointer to a {@link VkDebugMarkerMarkerInfoEXT} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics or compute operations</li>
	 * </ul>
	 *
	 * @param commandBuffer the command buffer into which the command is recorded
	 * @param pMarkerInfo   a pointer to an instance of the {@link VkDebugMarkerMarkerInfoEXT} structure specifying the parameters of the marker to insert
	 */
	public static void vkCmdDebugMarkerInsertEXT(VkCommandBuffer commandBuffer, VkDebugMarkerMarkerInfoEXT pMarkerInfo) {
		nvkCmdDebugMarkerInsertEXT(commandBuffer, pMarkerInfo.address());
	}

}