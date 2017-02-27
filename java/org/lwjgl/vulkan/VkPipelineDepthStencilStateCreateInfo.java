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
 * Structure specifying parameters of a newly created pipeline depth stencil state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-depthBounds">depth bounds testing</a> feature is not enabled, {@code depthBoundsTestEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code depthCompareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * <li>{@code front} <b>must</b> be a valid {@link VkStencilOpState} structure</li>
 * <li>{@code back} <b>must</b> be a valid {@link VkStencilOpState} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkStencilOpState}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code depthTestEnable} &ndash; controls whether <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-depth">depth testing</a> is enabled.</li>
 * <li>{@code depthWriteEnable} &ndash; controls whether <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-depth-write">depth writes</a> are enabled.</li>
 * <li>{@code depthCompareOp} &ndash; the comparison operator used in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-depth">depth test</a>.</li>
 * <li>{@code depthBoundsTestEnable} &ndash; controls whether <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-dbt">depth bounds testing</a> is enabled.</li>
 * <li>{@code stencilTestEnable} &ndash; controls whether <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-stencil">stencil testing</a> is enabled.</li>
 * <li>{@code front} &ndash; {@code front} and {@code back} control the parameters of the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-stencil">stencil test</a>.</li>
 * <li>{@code back} &ndash; see {@code front}</li>
 * <li>{@code minDepthBounds} &ndash; {@code minDepthBounds} and {@code maxDepthBounds} define the range of values used in the <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#fragops-dbt">depth bounds test</a>.</li>
 * <li>{@code maxDepthBounds} &ndash; see {@code minDepthBounds}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineDepthStencilStateCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineDepthStencilStateCreateFlags flags;
    VkBool32 depthTestEnable;
    VkBool32 depthWriteEnable;
    VkCompareOp depthCompareOp;
    VkBool32 depthBoundsTestEnable;
    VkBool32 stencilTestEnable;
    {@link VkStencilOpState VkStencilOpState} front;
    {@link VkStencilOpState VkStencilOpState} back;
    float minDepthBounds;
    float maxDepthBounds;
}</code></pre>
 */
public class VkPipelineDepthStencilStateCreateInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DEPTHTESTENABLE,
		DEPTHWRITEENABLE,
		DEPTHCOMPAREOP,
		DEPTHBOUNDSTESTENABLE,
		STENCILTESTENABLE,
		FRONT,
		BACK,
		MINDEPTHBOUNDS,
		MAXDEPTHBOUNDS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF),
			__member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		DEPTHTESTENABLE = layout.offsetof(3);
		DEPTHWRITEENABLE = layout.offsetof(4);
		DEPTHCOMPAREOP = layout.offsetof(5);
		DEPTHBOUNDSTESTENABLE = layout.offsetof(6);
		STENCILTESTENABLE = layout.offsetof(7);
		FRONT = layout.offsetof(8);
		BACK = layout.offsetof(9);
		MINDEPTHBOUNDS = layout.offsetof(10);
		MAXDEPTHBOUNDS = layout.offsetof(11);
	}

	VkPipelineDepthStencilStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineDepthStencilStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineDepthStencilStateCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code depthTestEnable} field. */
	public boolean depthTestEnable() { return ndepthTestEnable(address()) != 0; }
	/** Returns the value of the {@code depthWriteEnable} field. */
	public boolean depthWriteEnable() { return ndepthWriteEnable(address()) != 0; }
	/** Returns the value of the {@code depthCompareOp} field. */
	public int depthCompareOp() { return ndepthCompareOp(address()); }
	/** Returns the value of the {@code depthBoundsTestEnable} field. */
	public boolean depthBoundsTestEnable() { return ndepthBoundsTestEnable(address()) != 0; }
	/** Returns the value of the {@code stencilTestEnable} field. */
	public boolean stencilTestEnable() { return nstencilTestEnable(address()) != 0; }
	/** Returns a {@link VkStencilOpState} view of the {@code front} field. */
	public VkStencilOpState front() { return nfront(address()); }
	/** Returns a {@link VkStencilOpState} view of the {@code back} field. */
	public VkStencilOpState back() { return nback(address()); }
	/** Returns the value of the {@code minDepthBounds} field. */
	public float minDepthBounds() { return nminDepthBounds(address()); }
	/** Returns the value of the {@code maxDepthBounds} field. */
	public float maxDepthBounds() { return nmaxDepthBounds(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineDepthStencilStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineDepthStencilStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineDepthStencilStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code depthTestEnable} field. */
	public VkPipelineDepthStencilStateCreateInfo depthTestEnable(boolean value) { ndepthTestEnable(address(), value ? 1 : 0); return this; }
	/** Sets the specified value to the {@code depthWriteEnable} field. */
	public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(boolean value) { ndepthWriteEnable(address(), value ? 1 : 0); return this; }
	/** Sets the specified value to the {@code depthCompareOp} field. */
	public VkPipelineDepthStencilStateCreateInfo depthCompareOp(int value) { ndepthCompareOp(address(), value); return this; }
	/** Sets the specified value to the {@code depthBoundsTestEnable} field. */
	public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(boolean value) { ndepthBoundsTestEnable(address(), value ? 1 : 0); return this; }
	/** Sets the specified value to the {@code stencilTestEnable} field. */
	public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(boolean value) { nstencilTestEnable(address(), value ? 1 : 0); return this; }
	/** Copies the specified {@link VkStencilOpState} to the {@code front} field. */
	public VkPipelineDepthStencilStateCreateInfo front(VkStencilOpState value) { nfront(address(), value); return this; }
	/** Copies the specified {@link VkStencilOpState} to the {@code back} field. */
	public VkPipelineDepthStencilStateCreateInfo back(VkStencilOpState value) { nback(address(), value); return this; }
	/** Sets the specified value to the {@code minDepthBounds} field. */
	public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float value) { nminDepthBounds(address(), value); return this; }
	/** Sets the specified value to the {@code maxDepthBounds} field. */
	public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float value) { nmaxDepthBounds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineDepthStencilStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		boolean depthTestEnable,
		boolean depthWriteEnable,
		int depthCompareOp,
		boolean depthBoundsTestEnable,
		boolean stencilTestEnable,
		VkStencilOpState front,
		VkStencilOpState back,
		float minDepthBounds,
		float maxDepthBounds
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		depthTestEnable(depthTestEnable);
		depthWriteEnable(depthWriteEnable);
		depthCompareOp(depthCompareOp);
		depthBoundsTestEnable(depthBoundsTestEnable);
		stencilTestEnable(stencilTestEnable);
		front(front);
		back(back);
		minDepthBounds(minDepthBounds);
		maxDepthBounds(maxDepthBounds);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPipelineDepthStencilStateCreateInfo set(VkPipelineDepthStencilStateCreateInfo src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineDepthStencilStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineDepthStencilStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineDepthStencilStateCreateInfo create() {
		return new VkPipelineDepthStencilStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineDepthStencilStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineDepthStencilStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineDepthStencilStateCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineDepthStencilStateCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineDepthStencilStateCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineDepthStencilStateCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineDepthStencilStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #depthTestEnable}. */
	public static int ndepthTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE); }
	/** Unsafe version of {@link #depthWriteEnable}. */
	public static int ndepthWriteEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE); }
	/** Unsafe version of {@link #depthCompareOp}. */
	public static int ndepthCompareOp(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP); }
	/** Unsafe version of {@link #depthBoundsTestEnable}. */
	public static int ndepthBoundsTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE); }
	/** Unsafe version of {@link #stencilTestEnable}. */
	public static int nstencilTestEnable(long struct) { return memGetInt(struct + VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE); }
	/** Unsafe version of {@link #front}. */
	public static VkStencilOpState nfront(long struct) { return VkStencilOpState.create(struct + VkPipelineDepthStencilStateCreateInfo.FRONT); }
	/** Unsafe version of {@link #back}. */
	public static VkStencilOpState nback(long struct) { return VkStencilOpState.create(struct + VkPipelineDepthStencilStateCreateInfo.BACK); }
	/** Unsafe version of {@link #minDepthBounds}. */
	public static float nminDepthBounds(long struct) { return memGetFloat(struct + VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS); }
	/** Unsafe version of {@link #maxDepthBounds}. */
	public static float nmaxDepthBounds(long struct) { return memGetFloat(struct + VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineDepthStencilStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #depthTestEnable(boolean) depthTestEnable}. */
	public static void ndepthTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHTESTENABLE, value); }
	/** Unsafe version of {@link #depthWriteEnable(boolean) depthWriteEnable}. */
	public static void ndepthWriteEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHWRITEENABLE, value); }
	/** Unsafe version of {@link #depthCompareOp(int) depthCompareOp}. */
	public static void ndepthCompareOp(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHCOMPAREOP, value); }
	/** Unsafe version of {@link #depthBoundsTestEnable(boolean) depthBoundsTestEnable}. */
	public static void ndepthBoundsTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.DEPTHBOUNDSTESTENABLE, value); }
	/** Unsafe version of {@link #stencilTestEnable(boolean) stencilTestEnable}. */
	public static void nstencilTestEnable(long struct, int value) { memPutInt(struct + VkPipelineDepthStencilStateCreateInfo.STENCILTESTENABLE, value); }
	/** Unsafe version of {@link #front(VkStencilOpState) front}. */
	public static void nfront(long struct, VkStencilOpState value) { memCopy(value.address(), struct + VkPipelineDepthStencilStateCreateInfo.FRONT, VkStencilOpState.SIZEOF); }
	/** Unsafe version of {@link #back(VkStencilOpState) back}. */
	public static void nback(long struct, VkStencilOpState value) { memCopy(value.address(), struct + VkPipelineDepthStencilStateCreateInfo.BACK, VkStencilOpState.SIZEOF); }
	/** Unsafe version of {@link #minDepthBounds(float) minDepthBounds}. */
	public static void nminDepthBounds(long struct, float value) { memPutFloat(struct + VkPipelineDepthStencilStateCreateInfo.MINDEPTHBOUNDS, value); }
	/** Unsafe version of {@link #maxDepthBounds(float) maxDepthBounds}. */
	public static void nmaxDepthBounds(long struct, float value) { memPutFloat(struct + VkPipelineDepthStencilStateCreateInfo.MAXDEPTHBOUNDS, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineDepthStencilStateCreateInfo} structs. */
	public static class Buffer extends StructBuffer<VkPipelineDepthStencilStateCreateInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPipelineDepthStencilStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineDepthStencilStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineDepthStencilStateCreateInfo newInstance(long address) {
			return new VkPipelineDepthStencilStateCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineDepthStencilStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineDepthStencilStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineDepthStencilStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code depthTestEnable} field. */
		public boolean depthTestEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address()) != 0; }
		/** Returns the value of the {@code depthWriteEnable} field. */
		public boolean depthWriteEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address()) != 0; }
		/** Returns the value of the {@code depthCompareOp} field. */
		public int depthCompareOp() { return VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address()); }
		/** Returns the value of the {@code depthBoundsTestEnable} field. */
		public boolean depthBoundsTestEnable() { return VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address()) != 0; }
		/** Returns the value of the {@code stencilTestEnable} field. */
		public boolean stencilTestEnable() { return VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address()) != 0; }
		/** Returns a {@link VkStencilOpState} view of the {@code front} field. */
		public VkStencilOpState front() { return VkPipelineDepthStencilStateCreateInfo.nfront(address()); }
		/** Returns a {@link VkStencilOpState} view of the {@code back} field. */
		public VkStencilOpState back() { return VkPipelineDepthStencilStateCreateInfo.nback(address()); }
		/** Returns the value of the {@code minDepthBounds} field. */
		public float minDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address()); }
		/** Returns the value of the {@code maxDepthBounds} field. */
		public float maxDepthBounds() { return VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer sType(int value) { VkPipelineDepthStencilStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer pNext(long value) { VkPipelineDepthStencilStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer flags(int value) { VkPipelineDepthStencilStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code depthTestEnable} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer depthTestEnable(boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code depthWriteEnable} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer depthWriteEnable(boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code depthCompareOp} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer depthCompareOp(int value) { VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address(), value); return this; }
		/** Sets the specified value to the {@code depthBoundsTestEnable} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer depthBoundsTestEnable(boolean value) { VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address(), value ? 1 : 0); return this; }
		/** Sets the specified value to the {@code stencilTestEnable} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer stencilTestEnable(boolean value) { VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address(), value ? 1 : 0); return this; }
		/** Copies the specified {@link VkStencilOpState} to the {@code front} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer front(VkStencilOpState value) { VkPipelineDepthStencilStateCreateInfo.nfront(address(), value); return this; }
		/** Copies the specified {@link VkStencilOpState} to the {@code back} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer back(VkStencilOpState value) { VkPipelineDepthStencilStateCreateInfo.nback(address(), value); return this; }
		/** Sets the specified value to the {@code minDepthBounds} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer minDepthBounds(float value) { VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address(), value); return this; }
		/** Sets the specified value to the {@code maxDepthBounds} field. */
		public VkPipelineDepthStencilStateCreateInfo.Buffer maxDepthBounds(float value) { VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address(), value); return this; }

	}

}