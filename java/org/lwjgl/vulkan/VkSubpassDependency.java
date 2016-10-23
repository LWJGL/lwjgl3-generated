/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a subpass dependency.
 * 
 * <h5>Description</h5>
 * 
 * <p>Each subpass dependency defines an execution and memory dependency between two sets of commands, with the second set depending on the first set. When {@code srcSubpass} does not equal {@code dstSubpass} then the first set of commands is:</p>
 * 
 * <ul>
 * <li>All commands in the subpass indicated by {@code srcSubpass}, if {@code srcSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>All commands before the render pass instance, if {@code srcSubpass} is {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * </ul>
 * 
 * <p>While the corresponding second set of commands is:</p>
 * 
 * <ul>
 * <li>All commands in the subpass indicated by {@code dstSubpass}, if {@code dstSubpass} is not {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * <li>All commands after the render pass instance, if {@code dstSubpass} is {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}.</li>
 * </ul>
 * 
 * <p>When {@code srcSubpass} equals {@code dstSubpass} then the first set consists of commands in the subpass before a call to {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier} and the second set consists of commands in the subpass following that same call as described in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-barriers-subpass-self-dependencies"> Subpass Self-dependency</a> section.</p>
 * 
 * <p>The {@code srcStageMask}, {@code dstStageMask}, {@code srcAccessMask}, {@code dstAccessMask}, and {@code dependencyFlags} parameters of the dependency are interpreted the same way as for other dependencies, as described in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization"> Synchronization and Cache Control</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>{@code srcSubpass} <b>must</b> be less than or equal to {@code dstSubpass}, unless one of them is {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}, to avoid cyclic dependencies and ensure a valid execution order</li>
 * <li>{@code srcSubpass} and {@code dstSubpass} <b>must</b> not both be equal to {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}</li>
 * <li>If {@code srcSubpass} is equal to {@code dstSubpass}, {@code srcStageMask} and {@code dstStageMask} <b>must</b> only contain one of {@link VK10#VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT PIPELINE_STAGE_TOP_OF_PIPE_BIT}, {@link VK10#VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT PIPELINE_STAGE_DRAW_INDIRECT_BIT}, {@link VK10#VK_PIPELINE_STAGE_VERTEX_INPUT_BIT PIPELINE_STAGE_VERTEX_INPUT_BIT}, {@link VK10#VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT PIPELINE_STAGE_FRAGMENT_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT}, {@link VK10#VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT}, {@link VK10#VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT}, {@link VK10#VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT}, or {@link VK10#VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT PIPELINE_STAGE_ALL_GRAPHICS_BIT}</li>
 * <li>If {@code srcSubpass} is equal to {@code dstSubpass}, the highest bit value included in {@code srcStageMask} <b>must</b> be less than or equal to the lowest bit value in {@code dstStageMask}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code srcStageMask} <b>must</b> not be 0</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits} values</li>
 * <li>{@code dstStageMask} <b>must</b> not be 0</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dependencyFlags} <b>must</b> be a valid combination of {@code VkDependencyFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcSubpass} &ndash; {@code srcSubpass} and {@code dstSubpass} are the subpass indices of the producer and consumer subpasses, respectively. {@code srcSubpass} and {@code dstSubpass} <b>can</b> also have the special value {@link VK10#VK_SUBPASS_EXTERNAL SUBPASS_EXTERNAL}. The source subpass <b>must</b> always be a lower numbered subpass than the destination subpass (excluding external subpasses and <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-pipeline-barriers-subpass-self-dependencies">self-dependencies</a>), so that the order of subpass descriptions is a valid execution ordering, avoiding cycles in the dependency graph.</li>
 * <li>{@code dstSubpass} &ndash; see {@code srcSubpass}</li>
 * <li>{@code srcStageMask} &ndash; {@code srcStageMask}, {@code dstStageMask}, {@code srcAccessMask}, {@code dstAccessMask}, and {@code dependencyFlags} describe an <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-execution-and-memory-dependencies">execution and memory dependency</a> between subpasses. The bits that <b>can</b> be included in {@code dependencyFlags} are:
 * 
 * <pre><code>typedef enum VkDependencyFlagBits {
    VK_DEPENDENCY_BY_REGION_BIT = 0x00000001,
} VkDependencyFlagBits;</code></pre>
 * 
 * <ul>
 * <li>If {@code dependencyFlags} contains {@link VK10#VK_DEPENDENCY_BY_REGION_BIT DEPENDENCY_BY_REGION_BIT}, then the dependency is by-region as defined in <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-execution-and-memory-dependencies">Execution And Memory Dependencies</a>.</li>
 * </ul></li>
 * <li>{@code dstStageMask} &ndash; see {@code srcStageMask}</li>
 * <li>{@code srcAccessMask} &ndash; see {@code srcStageMask}</li>
 * <li>{@code dstAccessMask} &ndash; see {@code srcStageMask}</li>
 * <li>{@code dependencyFlags} &ndash; see {@code srcStageMask}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSubpassDependency {
    uint32_t srcSubpass;
    uint32_t dstSubpass;
    VkPipelineStageFlags srcStageMask;
    VkPipelineStageFlags dstStageMask;
    VkAccessFlags srcAccessMask;
    VkAccessFlags dstAccessMask;
    VkDependencyFlags dependencyFlags;
}</code></pre>
 */
public class VkSubpassDependency extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SRCSUBPASS,
		DSTSUBPASS,
		SRCSTAGEMASK,
		DSTSTAGEMASK,
		SRCACCESSMASK,
		DSTACCESSMASK,
		DEPENDENCYFLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SRCSUBPASS = layout.offsetof(0);
		DSTSUBPASS = layout.offsetof(1);
		SRCSTAGEMASK = layout.offsetof(2);
		DSTSTAGEMASK = layout.offsetof(3);
		SRCACCESSMASK = layout.offsetof(4);
		DSTACCESSMASK = layout.offsetof(5);
		DEPENDENCYFLAGS = layout.offsetof(6);
	}

	VkSubpassDependency(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubpassDependency} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubpassDependency(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code srcSubpass} field. */
	public int srcSubpass() { return nsrcSubpass(address()); }
	/** Returns the value of the {@code dstSubpass} field. */
	public int dstSubpass() { return ndstSubpass(address()); }
	/** Returns the value of the {@code srcStageMask} field. */
	public int srcStageMask() { return nsrcStageMask(address()); }
	/** Returns the value of the {@code dstStageMask} field. */
	public int dstStageMask() { return ndstStageMask(address()); }
	/** Returns the value of the {@code srcAccessMask} field. */
	public int srcAccessMask() { return nsrcAccessMask(address()); }
	/** Returns the value of the {@code dstAccessMask} field. */
	public int dstAccessMask() { return ndstAccessMask(address()); }
	/** Returns the value of the {@code dependencyFlags} field. */
	public int dependencyFlags() { return ndependencyFlags(address()); }

	/** Sets the specified value to the {@code srcSubpass} field. */
	public VkSubpassDependency srcSubpass(int value) { nsrcSubpass(address(), value); return this; }
	/** Sets the specified value to the {@code dstSubpass} field. */
	public VkSubpassDependency dstSubpass(int value) { ndstSubpass(address(), value); return this; }
	/** Sets the specified value to the {@code srcStageMask} field. */
	public VkSubpassDependency srcStageMask(int value) { nsrcStageMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstStageMask} field. */
	public VkSubpassDependency dstStageMask(int value) { ndstStageMask(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkSubpassDependency srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkSubpassDependency dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dependencyFlags} field. */
	public VkSubpassDependency dependencyFlags(int value) { ndependencyFlags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSubpassDependency set(
		int srcSubpass,
		int dstSubpass,
		int srcStageMask,
		int dstStageMask,
		int srcAccessMask,
		int dstAccessMask,
		int dependencyFlags
	) {
		srcSubpass(srcSubpass);
		dstSubpass(dstSubpass);
		srcStageMask(srcStageMask);
		dstStageMask(dstStageMask);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);
		dependencyFlags(dependencyFlags);

		return this;
	}

	/** Unsafe version of {@link #set(VkSubpassDependency) set}. */
	public VkSubpassDependency nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkSubpassDependency set(VkSubpassDependency src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSubpassDependency malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSubpassDependency calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link BufferUtils}. */
	public static VkSubpassDependency create() {
		return new VkSubpassDependency(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubpassDependency create(long address) {
		return address == NULL ? null : new VkSubpassDependency(address, null);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubpassDependency.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSubpassDependency} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSubpassDependency mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSubpassDependency} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSubpassDependency callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSubpassDependency} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSubpassDependency mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSubpassDependency} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSubpassDependency callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #srcSubpass}. */
	public static int nsrcSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSUBPASS); }
	/** Unsafe version of {@link #dstSubpass}. */
	public static int ndstSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSUBPASS); }
	/** Unsafe version of {@link #srcStageMask}. */
	public static int nsrcStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSTAGEMASK); }
	/** Unsafe version of {@link #dstStageMask}. */
	public static int ndstStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSTAGEMASK); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTACCESSMASK); }
	/** Unsafe version of {@link #dependencyFlags}. */
	public static int ndependencyFlags(long struct) { return memGetInt(struct + VkSubpassDependency.DEPENDENCYFLAGS); }

	/** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
	public static void nsrcSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSUBPASS, value); }
	/** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
	public static void ndstSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSUBPASS, value); }
	/** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
	public static void nsrcStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSTAGEMASK, value); }
	/** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
	public static void ndstStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSTAGEMASK, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTACCESSMASK, value); }
	/** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
	public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkSubpassDependency.DEPENDENCYFLAGS, value); }

	// -----------------------------------

	/** An array of {@link VkSubpassDependency} structs. */
	public static class Buffer extends StructBuffer<VkSubpassDependency, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkSubpassDependency.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubpassDependency#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected VkSubpassDependency newInstance(long address) {
			return new VkSubpassDependency(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code srcSubpass} field. */
		public int srcSubpass() { return VkSubpassDependency.nsrcSubpass(address()); }
		/** Returns the value of the {@code dstSubpass} field. */
		public int dstSubpass() { return VkSubpassDependency.ndstSubpass(address()); }
		/** Returns the value of the {@code srcStageMask} field. */
		public int srcStageMask() { return VkSubpassDependency.nsrcStageMask(address()); }
		/** Returns the value of the {@code dstStageMask} field. */
		public int dstStageMask() { return VkSubpassDependency.ndstStageMask(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkSubpassDependency.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkSubpassDependency.ndstAccessMask(address()); }
		/** Returns the value of the {@code dependencyFlags} field. */
		public int dependencyFlags() { return VkSubpassDependency.ndependencyFlags(address()); }

		/** Sets the specified value to the {@code srcSubpass} field. */
		public VkSubpassDependency.Buffer srcSubpass(int value) { VkSubpassDependency.nsrcSubpass(address(), value); return this; }
		/** Sets the specified value to the {@code dstSubpass} field. */
		public VkSubpassDependency.Buffer dstSubpass(int value) { VkSubpassDependency.ndstSubpass(address(), value); return this; }
		/** Sets the specified value to the {@code srcStageMask} field. */
		public VkSubpassDependency.Buffer srcStageMask(int value) { VkSubpassDependency.nsrcStageMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstStageMask} field. */
		public VkSubpassDependency.Buffer dstStageMask(int value) { VkSubpassDependency.ndstStageMask(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkSubpassDependency.Buffer srcAccessMask(int value) { VkSubpassDependency.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkSubpassDependency.Buffer dstAccessMask(int value) { VkSubpassDependency.ndstAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dependencyFlags} field. */
		public VkSubpassDependency.Buffer dependencyFlags(int value) { VkSubpassDependency.ndependencyFlags(address(), value); return this; }

	}

}