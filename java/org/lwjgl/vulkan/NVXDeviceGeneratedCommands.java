/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows the device to generate a number of critical commands for command buffers.
 * 
 * <p>When rendering a large number of objects, the device can be leveraged to implement a number of critical functions, like updating matrices, or implementing occlusion culling, frustum culling, front to back sorting... Implementing those on the device does not require any special extension, since an application is free to define its own data structure, and just process them using shaders.</p>
 * 
 * <p>However, if the application desires to quickly kick off the rendering of the final stream of objects, then unextended Vulkan forces the application to read back the processed stream and issue graphics command from the host. For very large scenes, the synchronization overhead, and cost to generate the command buffer can become the bottleneck. This extension allows an application to generate a device side stream of state changes and commands, and convert it efficiently into a command buffer without having to read it back on the host.</p>
 * 
 * <p>Furthermore, it allows incremental changes to such command buffers, by manipulating only partial sections of a command stream, for example pipeline bindings. Unextended Vulkan requires re-creation of entire command buffers in such scenario, or updates synchronized on the host.</p>
 * 
 * <p>The intended usage for this extension is for the application to:</p>
 * 
 * <ul>
 * <li>create its objects as in unextended Vulkan</li>
 * <li>create a VkObjectTableNVX, and register the various Vulkan objects that are needed to evaluate the input parameters.</li>
 * <li>create a VkIndirectCommandsLayoutNVX, which lists the VkIndirectCommandsTokenTypes it wants to dynamically change as atomic command sequence. This step likely involves some internal device code compilation, since the intent is for the GPU to generate the command buffer in the pipeline.</li>
 * <li>fill the input buffers with the data for each of the inputs it needs. Each input is an array that will be filled with an index in the object table, instead of using CPU pointers.</li>
 * <li>set up a target secondary command buffer</li>
 * <li>reserve command buffer space via vkCmdReserveSpaceForCommandsNVX in a target command buffer at the position you want the generated commands to be executed.</li>
 * <li>call vkCmdProcessCommandsNVX to create the actual device commands for all sequences based on the array contents into a provided target command buffer.</li>
 * <li>execute the target command buffer like a regular secondary command buffer</li>
 * </ul>
 * 
 * <p>For each draw/dispatch, the following can be specified:</p>
 * 
 * <ul>
 * <li>a different pipeline state object</li>
 * <li>a number of descriptor sets, with dynamic offsets</li>
 * <li>a number of vertex buffer bindings, with an optional dynamic offset</li>
 * <li>a different index buffer, with an optional dynamic offset</li>
 * </ul>
 * 
 * <p>It is recommended to register a small number of objects and to use dynamic offsets whenever possible.</p>
 * 
 * <p>While the GPU can be faster than a CPU to generate the commands, it may not happen asynchronously, therefore the primary use-case is generating "less" total work (occlusion culling, classification to use specialized shaders...).</p>
 */
public class NVXDeviceGeneratedCommands {

	/** The extension specification version. */
	public static final int VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NVX_device_generated_commands";

	/**
	 * Extends {@code VkStructureType}.
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX}</li>
	 * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX}</li>
	 * </ul>
	 */
	public static final int
		VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX             = 1000086000,
		VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX = 1000086001,
		VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX            = 1000086002,
		VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX  = 1000086003,
		VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX     = 1000086004,
		VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_FEATURES_NVX   = 1000086005;

	/** Extends {@code VkPipelineStageFlagBits}. */
	public static final int VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX = 0x20000;

	/**
	 * VkIndirectCommandsLayoutUsageFlagBitsNVX - Bitmask specifying allowed usage of a indirect commands layout
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkIndirectCommandsLayoutCreateInfoNVX}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkIndirectCommandsLayoutUsageFlagsNVX}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX}</li>
	 * </ul>
	 */
	public static final int
		VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX = 0x1,
		VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX    = 0x2,
		VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX    = 0x4,
		VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX   = 0x8;

	/**
	 * VkObjectEntryUsageFlagBitsNVX - Bitmask specifying allowed usage of an object entry
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkObjectTableCreateInfoNVX}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@code VkObjectEntryUsageFlagsNVX}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX}</li>
	 * <li>{@link #VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX}</li>
	 * </ul>
	 */
	public static final int
		VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX = 0x1,
		VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX  = 0x2;

	/**
	 * VkIndirectCommandsTokenTypeNVX - Enum specifying
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkIndirectCommandsLayoutTokenNVX}, {@link VkIndirectCommandsTokenNVX}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_PIPELINE_NVX INDIRECT_COMMANDS_TOKEN_PIPELINE_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_DESCRIPTOR_SET_NVX INDIRECT_COMMANDS_TOKEN_DESCRIPTOR_SET_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_INDEX_BUFFER_NVX INDIRECT_COMMANDS_TOKEN_INDEX_BUFFER_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_VERTEX_BUFFER_NVX INDIRECT_COMMANDS_TOKEN_VERTEX_BUFFER_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_PUSH_CONSTANT_NVX INDIRECT_COMMANDS_TOKEN_PUSH_CONSTANT_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_DRAW_INDEXED_NVX INDIRECT_COMMANDS_TOKEN_DRAW_INDEXED_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_DRAW_NVX INDIRECT_COMMANDS_TOKEN_DRAW_NVX}</li>
	 * <li>{@link #VK_INDIRECT_COMMANDS_TOKEN_DISPATCH_NVX INDIRECT_COMMANDS_TOKEN_DISPATCH_NVX}</li>
	 * </ul>
	 */
	public static final int
		VK_INDIRECT_COMMANDS_TOKEN_PIPELINE_NVX       = 0,
		VK_INDIRECT_COMMANDS_TOKEN_DESCRIPTOR_SET_NVX = 1,
		VK_INDIRECT_COMMANDS_TOKEN_INDEX_BUFFER_NVX   = 2,
		VK_INDIRECT_COMMANDS_TOKEN_VERTEX_BUFFER_NVX  = 3,
		VK_INDIRECT_COMMANDS_TOKEN_PUSH_CONSTANT_NVX  = 4,
		VK_INDIRECT_COMMANDS_TOKEN_DRAW_INDEXED_NVX   = 5,
		VK_INDIRECT_COMMANDS_TOKEN_DRAW_NVX           = 6,
		VK_INDIRECT_COMMANDS_TOKEN_DISPATCH_NVX       = 7;

	/**
	 * VkObjectEntryTypeNVX - Enum specifying object table entry type
	 * 
	 * <h5>Description</h5>
	 * 
	 * <p>For more information, see:</p>
	 * 
	 * <ul>
	 * <li>The reference page for {@link VkObjectTableCreateInfoNVX}, where this interface is defined.</li>
	 * <li>The See Also section for other reference pages using this type.</li>
	 * <li>The Vulkan Specification.</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkObjectTableCreateInfoNVX}, {@link VkObjectTableDescriptorSetEntryNVX}, {@link VkObjectTableEntryNVX}, {@link VkObjectTableIndexBufferEntryNVX}, {@link VkObjectTablePipelineEntryNVX}, {@link VkObjectTablePushConstantEntryNVX}, {@link VkObjectTableVertexBufferEntryNVX}, {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX}</p>
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #VK_OBJECT_ENTRY_DESCRIPTOR_SET_NVX OBJECT_ENTRY_DESCRIPTOR_SET_NVX}</li>
	 * <li>{@link #VK_OBJECT_ENTRY_PIPELINE_NVX OBJECT_ENTRY_PIPELINE_NVX}</li>
	 * <li>{@link #VK_OBJECT_ENTRY_INDEX_BUFFER_NVX OBJECT_ENTRY_INDEX_BUFFER_NVX}</li>
	 * <li>{@link #VK_OBJECT_ENTRY_VERTEX_BUFFER_NVX OBJECT_ENTRY_VERTEX_BUFFER_NVX}</li>
	 * <li>{@link #VK_OBJECT_ENTRY_PUSH_CONSTANT_NVX OBJECT_ENTRY_PUSH_CONSTANT_NVX}</li>
	 * </ul>
	 */
	public static final int
		VK_OBJECT_ENTRY_DESCRIPTOR_SET_NVX = 0,
		VK_OBJECT_ENTRY_PIPELINE_NVX       = 1,
		VK_OBJECT_ENTRY_INDEX_BUFFER_NVX   = 2,
		VK_OBJECT_ENTRY_VERTEX_BUFFER_NVX  = 3,
		VK_OBJECT_ENTRY_PUSH_CONSTANT_NVX  = 4;

	protected NVXDeviceGeneratedCommands() {
		throw new UnsupportedOperationException();
	}

	static boolean isAvailable(VKCapabilities caps) {
		return checkFunctions(
			caps.vkCmdProcessCommandsNVX, caps.vkCmdReserveSpaceForCommandsNVX, caps.vkCreateIndirectCommandsLayoutNVX, caps.vkDestroyIndirectCommandsLayoutNVX, 
			caps.vkCreateObjectTableNVX, caps.vkDestroyObjectTableNVX, caps.vkRegisterObjectsNVX, caps.vkUnregisterObjectsNVX, 
			caps.vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX
		);
	}

	// --- [ vkCmdProcessCommandsNVX ] ---

	/** Unsafe version of: {@link #vkCmdProcessCommandsNVX CmdProcessCommandsNVX} */
	public static void nvkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, long pProcessCommandsInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdProcessCommandsNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			VkCmdProcessCommandsInfoNVX.validate(pProcessCommandsInfo);
		}
		callPPV(__functionAddress, commandBuffer.address(), pProcessCommandsInfo);
	}

	/**
	 * Performs the generation of commands on the device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>The actual generation on the device is handled with:</p>
	 * 
	 * <pre><code>void vkCmdProcessCommandsNVX(
    VkCommandBuffer                             commandBuffer,
    const VkCmdProcessCommandsInfoNVX*          pProcessCommandsInfo);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pProcessCommandsInfo} <b>must</b> be a pointer to a valid {@link VkCmdProcessCommandsInfoNVX} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
	 * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics compute</td><td></td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCmdProcessCommandsInfoNVX}</p>
	 *
	 * @param commandBuffer        the primary command buffer in which the generation process takes space.
	 * @param pProcessCommandsInfo a pointer to an instance of the {@link VkCmdProcessCommandsInfoNVX} structure containing parameters affecting the processing of commands.
	 */
	public static void vkCmdProcessCommandsNVX(VkCommandBuffer commandBuffer, VkCmdProcessCommandsInfoNVX pProcessCommandsInfo) {
		nvkCmdProcessCommandsNVX(commandBuffer, pProcessCommandsInfo.address());
	}

	// --- [ vkCmdReserveSpaceForCommandsNVX ] ---

	/** Unsafe version of: {@link #vkCmdReserveSpaceForCommandsNVX CmdReserveSpaceForCommandsNVX} */
	public static void nvkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, long pReserveSpaceInfo) {
		long __functionAddress = commandBuffer.getCapabilities().vkCmdReserveSpaceForCommandsNVX;
		if ( CHECKS )
			check(__functionAddress);
		callPPV(__functionAddress, commandBuffer.address(), pReserveSpaceInfo);
	}

	/**
	 * Perform a reservation of command buffer space.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Command space for generated commands recorded into a secondary command buffer <b>must</b> be reserved by calling:</p>
	 * 
	 * <pre><code>void vkCmdReserveSpaceForCommandsNVX(
    VkCommandBuffer                             commandBuffer,
    const VkCmdReserveSpaceForCommandsInfoNVX*  pReserveSpaceInfo);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The provided {@code commandBuffer} <b>must</b> not have had a prior space reservation since its creation or the last reset.</li>
	 * <li>The state of the {@code commandBuffer} <b>must</b> be legal to execute all commands within the sequence provided by the {@code indirectCommandsLayout} member of {@code pProcessCommandsInfo}.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
	 * <li>{@code pReserveSpaceInfo} <b>must</b> be a pointer to a valid {@link VkCmdReserveSpaceForCommandsInfoNVX} structure</li>
	 * <li>{@code commandBuffer} <b>must</b> be in the recording state</li>
	 * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
	 * <li>This command <b>must</b> only be called inside of a render pass instance</li>
	 * <li>{@code commandBuffer} <b>must</b> be a secondary {@code VkCommandBuffer}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
	 * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>Command Properties</h5>
	 * 
	 * <table class="lwjgl">
	 * <thead><tr><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
	 * <tbody><tr><td>Secondary</td><td>Inside</td><td>Graphics compute</td><td></td></tr></tbody>
	 * </table>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkCmdReserveSpaceForCommandsInfoNVX}</p>
	 *
	 * @param commandBuffer     the secondary command buffer in which the space for device-generated commands is reserved.
	 * @param pReserveSpaceInfo 
	 */
	public static void vkCmdReserveSpaceForCommandsNVX(VkCommandBuffer commandBuffer, VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo) {
		nvkCmdReserveSpaceForCommandsNVX(commandBuffer, pReserveSpaceInfo.address());
	}

	// --- [ vkCreateIndirectCommandsLayoutNVX ] ---

	/** Unsafe version of: {@link #vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX} */
	public static int nvkCreateIndirectCommandsLayoutNVX(VkDevice device, long pCreateInfo, long pAllocator, long pIndirectCommandsLayout) {
		long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			VkIndirectCommandsLayoutCreateInfoNVX.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pIndirectCommandsLayout);
	}

	/**
	 * (no short description available).
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Indirect command layouts are created by:</p>
	 * 
	 * <pre><code>VkResult vkCreateIndirectCommandsLayoutNVX(
    VkDevice                                    device,
    const VkIndirectCommandsLayoutCreateInfoNVX* pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkIndirectCommandsLayoutNVX*                pIndirectCommandsLayout);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkIndirectCommandsLayoutCreateInfoNVX} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pIndirectCommandsLayout} <b>must</b> be a pointer to a {@code VkIndirectCommandsLayoutNVX} handle</li>
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
	 * <p>{@link VkAllocationCallbacks}, {@link VkIndirectCommandsLayoutCreateInfoNVX}</p>
	 *
	 * @param device                  the logical device that creates the object table.
	 * @param pCreateInfo             a pointer to an instance of the {@link VkObjectTableCreateInfoNVX} structure containing parameters affecting creation of the table.
	 * @param pAllocator              controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pIndirectCommandsLayout points to a {@code VkObjectTableNVX} handle in which the resulting object table is returned.
	 */
	public static int vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pIndirectCommandsLayout) {
		if ( CHECKS )
			check(pIndirectCommandsLayout, 1);
		return nvkCreateIndirectCommandsLayoutNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pIndirectCommandsLayout));
	}

	// --- [ vkDestroyIndirectCommandsLayoutNVX ] ---

	/** Unsafe version of: {@link #vkDestroyIndirectCommandsLayoutNVX DestroyIndirectCommandsLayoutNVX} */
	public static void nvkDestroyIndirectCommandsLayoutNVX(VkDevice device, long indirectCommandsLayout, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyIndirectCommandsLayoutNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), indirectCommandsLayout, pAllocator);
	}

	/**
	 * Destroy a object table.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Indirect command layouts are destroyed by:</p>
	 * 
	 * <pre><code>void vkDestroyIndirectCommandsLayoutNVX(
    VkDevice                                    device,
    VkIndirectCommandsLayoutNVX                 indirectCommandsLayout,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code indirectCommandsLayout} <b>must</b> have completed execution</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, a compatible set of callbacks <b>must</b> be provided here</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code indirectCommandsLayout} <b>must</b> be a valid {@code VkIndirectCommandsLayoutNVX} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code indirectCommandsLayout} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device                 the logical device that destroys the layout.
	 * @param indirectCommandsLayout the table to destroy.
	 * @param pAllocator             controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyIndirectCommandsLayoutNVX(VkDevice device, long indirectCommandsLayout, VkAllocationCallbacks pAllocator) {
		nvkDestroyIndirectCommandsLayoutNVX(device, indirectCommandsLayout, memAddressSafe(pAllocator));
	}

	// --- [ vkCreateObjectTableNVX ] ---

	/** Unsafe version of: {@link #vkCreateObjectTableNVX CreateObjectTableNVX} */
	public static int nvkCreateObjectTableNVX(VkDevice device, long pCreateInfo, long pAllocator, long pObjectTable) {
		long __functionAddress = device.getCapabilities().vkCreateObjectTableNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			VkObjectTableCreateInfoNVX.validate(pCreateInfo);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo, pAllocator, pObjectTable);
	}

	/**
	 * (no short description available).
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To create object tables, call:</p>
	 * 
	 * <pre><code>VkResult vkCreateObjectTableNVX(
    VkDevice                                    device,
    const VkObjectTableCreateInfoNVX*           pCreateInfo,
    const VkAllocationCallbacks*                pAllocator,
    VkObjectTableNVX*                           pObjectTable);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid {@link VkObjectTableCreateInfoNVX} structure</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code pObjectTable} <b>must</b> be a pointer to a {@code VkObjectTableNVX} handle</li>
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
	 * <p>{@link VkAllocationCallbacks}, {@link VkObjectTableCreateInfoNVX}</p>
	 *
	 * @param device       the logical device that creates the object table.
	 * @param pCreateInfo  a pointer to an instance of the {@link VkObjectTableCreateInfoNVX} structure containing parameters affecting creation of the table.
	 * @param pAllocator   controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 * @param pObjectTable points to a {@code VkObjectTableNVX} handle in which the resulting object table is returned.
	 */
	public static int vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, LongBuffer pObjectTable) {
		if ( CHECKS )
			check(pObjectTable, 1);
		return nvkCreateObjectTableNVX(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pObjectTable));
	}

	// --- [ vkDestroyObjectTableNVX ] ---

	/** Unsafe version of: {@link #vkDestroyObjectTableNVX DestroyObjectTableNVX} */
	public static void nvkDestroyObjectTableNVX(VkDevice device, long objectTable, long pAllocator) {
		long __functionAddress = device.getCapabilities().vkDestroyObjectTableNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			if ( pAllocator != NULL ) VkAllocationCallbacks.validate(pAllocator);
		}
		callPJPV(__functionAddress, device.address(), objectTable, pAllocator);
	}

	/**
	 * Destroy a object table.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To destroy an object table, call:</p>
	 * 
	 * <pre><code>void vkDestroyObjectTableNVX(
    VkDevice                                    device,
    VkObjectTableNVX                            objectTable,
    const VkAllocationCallbacks*                pAllocator);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>All submitted commands that refer to {@code objectTable} <b>must</b> have completed execution.</li>
	 * <li>If {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, a compatible set of callbacks <b>must</b> be provided here.</li>
	 * <li>If no {@link VkAllocationCallbacks} were provided when {@code objectTable} was created, {@code pAllocator} <b>must</b> be {@code NULL}.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
	 * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid {@link VkAllocationCallbacks} structure</li>
	 * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkAllocationCallbacks}</p>
	 *
	 * @param device      the logical device that destroys the table.
	 * @param objectTable the table to destroy.
	 * @param pAllocator  controls host memory allocation as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
	 */
	public static void vkDestroyObjectTableNVX(VkDevice device, long objectTable, VkAllocationCallbacks pAllocator) {
		nvkDestroyObjectTableNVX(device, objectTable, memAddressSafe(pAllocator));
	}

	// --- [ vkRegisterObjectsNVX ] ---

	/**
	 * Unsafe version of: {@link #vkRegisterObjectsNVX RegisterObjectsNVX}
	 *
	 * @param objectCount the number of resources to register.
	 */
	public static int nvkRegisterObjectsNVX(VkDevice device, long objectTable, int objectCount, long ppObjectTableEntries, long pObjectIndices) {
		long __functionAddress = device.getCapabilities().vkRegisterObjectsNVX;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), objectTable, objectCount, ppObjectTableEntries, pObjectIndices);
	}

	/**
	 * (no short description available).
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Resource bindings of Vulkan objects are registered at an arbitrary ftext:uint32_t index within an object table. As long as the object table references such objects, they must not be deleted.</p>
	 * 
	 * <pre><code>VkResult vkRegisterObjectsNVX(
    VkDevice                                    device,
    VkObjectTableNVX                            objectTable,
    uint32_t                                    objectCount,
    const VkObjectTableEntryNVX* const*         ppObjectTableEntries,
    const uint32_t*                             pObjectIndices);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>The contents of {@code pObjectTableEntry} must yield plausible bindings supported by the device.</li>
	 * <li>At any {@code pObjectIndices} there <b>must</b> not be a registered resource already.</li>
	 * <li>Any value inside {@code pObjectIndices} <b>must</b> be below the appropriate {@link VkObjectTableCreateInfoNVX}{@code ::pObjectEntryCounts} limits provided at {@code objectTable} creation time.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
	 * <li>{@code ppObjectTableEntries} <b>must</b> be a pointer to an array of {@code objectCount} valid {@link VkObjectTableEntryNVX} structures</li>
	 * <li>{@code pObjectIndices} <b>must</b> be a pointer to an array of {@code objectCount} {@code uint32_t} values</li>
	 * <li>{@code objectCount} <b>must</b> be greater than 0</li>
	 * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
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
	 * <p>{@link VkObjectTableEntryNVX}</p>
	 *
	 * @param device               the logical device that creates the object table.
	 * @param objectTable          the table for which the resources are registered.
	 * @param ppObjectTableEntries provides an array for detailed binding informations, each array element is a pointer to a struct of type {@link VkObjectTablePipelineEntryNVX}, {@link VkObjectTableDescriptorSetEntryNVX}, {@link VkObjectTableVertexBufferEntryNVX}, {@link VkObjectTableIndexBufferEntryNVX} or {@link VkObjectTablePushConstantEntryNVX} (see below for details).
	 * @param pObjectIndices       are the indices at which each resource is registered.
	 */
	public static int vkRegisterObjectsNVX(VkDevice device, long objectTable, PointerBuffer ppObjectTableEntries, IntBuffer pObjectIndices) {
		if ( CHECKS )
			check(pObjectIndices, ppObjectTableEntries.remaining());
		return nvkRegisterObjectsNVX(device, objectTable, ppObjectTableEntries.remaining(), memAddress(ppObjectTableEntries), memAddress(pObjectIndices));
	}

	// --- [ vkUnregisterObjectsNVX ] ---

	/**
	 * Unsafe version of: {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX}
	 *
	 * @param objectCount the number of resources being removed from the object table.
	 */
	public static int nvkUnregisterObjectsNVX(VkDevice device, long objectTable, int objectCount, long pObjectEntryTypes, long pObjectIndices) {
		long __functionAddress = device.getCapabilities().vkUnregisterObjectsNVX;
		if ( CHECKS )
			check(__functionAddress);
		return callPJPPI(__functionAddress, device.address(), objectTable, objectCount, pObjectEntryTypes, pObjectIndices);
	}

	/**
	 * (no short description available).
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>Using the following command to unregister resources from an object table:</p>
	 * 
	 * <pre><code>VkResult vkUnregisterObjectsNVX(
    VkDevice                                    device,
    VkObjectTableNVX                            objectTable,
    uint32_t                                    objectCount,
    const VkObjectEntryTypeNVX*                 pObjectEntryTypes,
    const uint32_t*                             pObjectIndices);</code></pre>
	 * 
	 * <h5>Valid Usage</h5>
	 * 
	 * <ul>
	 * <li>At any {@code pObjectIndices} there <b>must</b> be a registered resource already.</li>
	 * <li>The {@code pObjectEntryTypes} of the resource at {@code pObjectIndices} <b>must</b> match.</li>
	 * <li>All operations on the device using the registered resource must have been completed.</li>
	 * </ul>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
	 * <li>{@code objectTable} <b>must</b> be a valid {@code VkObjectTableNVX} handle</li>
	 * <li>{@code pObjectEntryTypes} <b>must</b> be a pointer to an array of {@code objectCount} valid {@code VkObjectEntryTypeNVX} values</li>
	 * <li>{@code pObjectIndices} <b>must</b> be a pointer to an array of {@code objectCount} {@code uint32_t} values</li>
	 * <li>{@code objectCount} <b>must</b> be greater than 0</li>
	 * <li>{@code objectTable} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
	 * </ul>
	 * 
	 * <h5>Host Synchronization</h5>
	 * 
	 * <ul>
	 * <li>Host access to {@code objectTable} <b>must</b> be externally synchronized</li>
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
	 * @param device            the logical device that creates the object table.
	 * @param objectTable       the table from which the resources are unregistered.
	 * @param pObjectEntryTypes 
	 * @param pObjectIndices    provides the array of object indices to be removed.
	 */
	public static int vkUnregisterObjectsNVX(VkDevice device, long objectTable, IntBuffer pObjectEntryTypes, IntBuffer pObjectIndices) {
		if ( CHECKS )
			check(pObjectIndices, pObjectEntryTypes.remaining());
		return nvkUnregisterObjectsNVX(device, objectTable, pObjectEntryTypes.remaining(), memAddress(pObjectEntryTypes), memAddress(pObjectIndices));
	}

	// --- [ vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX ] ---

	/** Unsafe version of: {@link #vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX GetPhysicalDeviceGeneratedCommandsPropertiesNVX} */
	public static void nvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, long pFeatures, long pLimits) {
		long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX;
		if ( CHECKS )
			check(__functionAddress);
		callPPPV(__functionAddress, physicalDevice.address(), pFeatures, pLimits);
	}

	/**
	 * Returns device-generated commands related properties of a physical device.
	 * 
	 * <h5>C Specification</h5>
	 * 
	 * <p>To query the support of related features and limitations, call:</p>
	 * 
	 * <pre><code>void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(
    VkPhysicalDevice                            physicalDevice,
    VkDeviceGeneratedCommandsFeaturesNVX*       pFeatures,
    VkDeviceGeneratedCommandsLimitsNVX*         pLimits);</code></pre>
	 * 
	 * <h5>Valid Usage (Implicit)</h5>
	 * 
	 * <ul>
	 * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
	 * <li>{@code pFeatures} <b>must</b> be a pointer to a {@link VkDeviceGeneratedCommandsFeaturesNVX} structure</li>
	 * <li>{@code pLimits} <b>must</b> be a pointer to a {@link VkDeviceGeneratedCommandsLimitsNVX} structure</li>
	 * </ul>
	 * 
	 * <h5>See Also</h5>
	 * 
	 * <p>{@link VkDeviceGeneratedCommandsFeaturesNVX}, {@link VkDeviceGeneratedCommandsLimitsNVX}</p>
	 *
	 * @param physicalDevice the handle to the physical device whose properties will be queried.
	 * @param pFeatures      points to an instance of the {@link VkDeviceGeneratedCommandsFeaturesNVX} structure, that will be filled with returned information.
	 * @param pLimits        points to an instance of the {@link VkDeviceGeneratedCommandsLimitsNVX} structure, that will be filled with returned information.
	 */
	public static void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(VkPhysicalDevice physicalDevice, VkDeviceGeneratedCommandsFeaturesNVX pFeatures, VkDeviceGeneratedCommandsLimitsNVX pLimits) {
		nvkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(physicalDevice, pFeatures.address(), pLimits.address());
	}

	/** Array version of: {@link #vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX} */
	public static int vkCreateIndirectCommandsLayoutNVX(VkDevice device, VkIndirectCommandsLayoutCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, long[] pIndirectCommandsLayout) {
		long __functionAddress = device.getCapabilities().vkCreateIndirectCommandsLayoutNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pIndirectCommandsLayout, 1);
			VkIndirectCommandsLayoutCreateInfoNVX.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pIndirectCommandsLayout);
	}

	/** Array version of: {@link #vkCreateObjectTableNVX CreateObjectTableNVX} */
	public static int vkCreateObjectTableNVX(VkDevice device, VkObjectTableCreateInfoNVX pCreateInfo, VkAllocationCallbacks pAllocator, long[] pObjectTable) {
		long __functionAddress = device.getCapabilities().vkCreateObjectTableNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pObjectTable, 1);
			VkObjectTableCreateInfoNVX.validate(pCreateInfo.address());
			if ( pAllocator != null ) VkAllocationCallbacks.validate(pAllocator.address());
		}
		return callPPPPI(__functionAddress, device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pObjectTable);
	}

	/** Array version of: {@link #vkRegisterObjectsNVX RegisterObjectsNVX} */
	public static int vkRegisterObjectsNVX(VkDevice device, long objectTable, PointerBuffer ppObjectTableEntries, int[] pObjectIndices) {
		long __functionAddress = device.getCapabilities().vkRegisterObjectsNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pObjectIndices, ppObjectTableEntries.remaining());
		}
		return callPJPPI(__functionAddress, device.address(), objectTable, ppObjectTableEntries.remaining(), memAddress(ppObjectTableEntries), pObjectIndices);
	}

	/** Array version of: {@link #vkUnregisterObjectsNVX UnregisterObjectsNVX} */
	public static int vkUnregisterObjectsNVX(VkDevice device, long objectTable, int[] pObjectEntryTypes, int[] pObjectIndices) {
		long __functionAddress = device.getCapabilities().vkUnregisterObjectsNVX;
		if ( CHECKS ) {
			check(__functionAddress);
			check(pObjectIndices, pObjectEntryTypes.length);
		}
		return callPJPPI(__functionAddress, device.address(), objectTable, pObjectEntryTypes.length, pObjectEntryTypes, pObjectIndices);
	}

}