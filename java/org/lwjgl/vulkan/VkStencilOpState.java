/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkStencilOpState.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkStencilOpState">Vulkan Specification</a>
 * 
 * <p>Contains information about the stencil test as part of graphics pipeline creation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code failOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code passOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code depthFailOp} <b>must</b> be a valid {@code VkStencilOp} value</li>
 * <li>{@code compareOp} <b>must</b> be a valid {@code VkCompareOp} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code failOp} &ndash; the action performed on samples that fail the stencil test. One of:<br><table><tr><td>{@link VK10#VK_STENCIL_OP_DECREMENT_AND_CLAMP STENCIL_OP_DECREMENT_AND_CLAMP}</td><td>{@link VK10#VK_STENCIL_OP_DECREMENT_AND_WRAP STENCIL_OP_DECREMENT_AND_WRAP}</td><td>{@link VK10#VK_STENCIL_OP_INCREMENT_AND_CLAMP STENCIL_OP_INCREMENT_AND_CLAMP}</td></tr><tr><td>{@link VK10#VK_STENCIL_OP_INCREMENT_AND_WRAP STENCIL_OP_INCREMENT_AND_WRAP}</td><td>{@link VK10#VK_STENCIL_OP_INVERT STENCIL_OP_INVERT}</td><td>{@link VK10#VK_STENCIL_OP_KEEP STENCIL_OP_KEEP}</td></tr><tr><td>{@link VK10#VK_STENCIL_OP_REPLACE STENCIL_OP_REPLACE}</td><td>{@link VK10#VK_STENCIL_OP_ZERO STENCIL_OP_ZERO}</td></tr></table></li>
 * <li>{@code passOp} &ndash; the action performed on samples that pass both the depth and stencil tests</li>
 * <li>{@code depthFailOp} &ndash; the action performed on samples that pass the stencil test and fail the depth test</li>
 * <li>{@code compareOp} &ndash; the comparison operator used in the stencil test. One of:<br><table><tr><td>{@link VK10#VK_COMPARE_OP_ALWAYS COMPARE_OP_ALWAYS}</td><td>{@link VK10#VK_COMPARE_OP_EQUAL COMPARE_OP_EQUAL}</td><td>{@link VK10#VK_COMPARE_OP_GREATER COMPARE_OP_GREATER}</td><td>{@link VK10#VK_COMPARE_OP_GREATER_OR_EQUAL COMPARE_OP_GREATER_OR_EQUAL}</td></tr><tr><td>{@link VK10#VK_COMPARE_OP_LESS COMPARE_OP_LESS}</td><td>{@link VK10#VK_COMPARE_OP_LESS_OR_EQUAL COMPARE_OP_LESS_OR_EQUAL}</td><td>{@link VK10#VK_COMPARE_OP_NEVER COMPARE_OP_NEVER}</td><td>{@link VK10#VK_COMPARE_OP_NOT_EQUAL COMPARE_OP_NOT_EQUAL}</td></tr></table></li>
 * <li>{@code compareMask} &ndash; selects the bits of the unsigned integer stencil values participating in the stencil test</li>
 * <li>{@code writeMask} &ndash; selects the bits of the unsigned integer stencil values updated by the stencil test in the stencil framebuffer attachment</li>
 * <li>{@code reference} &ndash; an integer reference value that is used in the unsigned stencil comparison</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkStencilOpState {
    VkStencilOp failOp;
    VkStencilOp passOp;
    VkStencilOp depthFailOp;
    VkCompareOp compareOp;
    uint32_t compareMask;
    uint32_t writeMask;
    uint32_t reference;
}</code></pre>
 */
public class VkStencilOpState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FAILOP,
		PASSOP,
		DEPTHFAILOP,
		COMPAREOP,
		COMPAREMASK,
		WRITEMASK,
		REFERENCE;

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

		FAILOP = layout.offsetof(0);
		PASSOP = layout.offsetof(1);
		DEPTHFAILOP = layout.offsetof(2);
		COMPAREOP = layout.offsetof(3);
		COMPAREMASK = layout.offsetof(4);
		WRITEMASK = layout.offsetof(5);
		REFERENCE = layout.offsetof(6);
	}

	VkStencilOpState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkStencilOpState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkStencilOpState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code failOp} field. */
	public int failOp() { return nfailOp(address()); }
	/** Returns the value of the {@code passOp} field. */
	public int passOp() { return npassOp(address()); }
	/** Returns the value of the {@code depthFailOp} field. */
	public int depthFailOp() { return ndepthFailOp(address()); }
	/** Returns the value of the {@code compareOp} field. */
	public int compareOp() { return ncompareOp(address()); }
	/** Returns the value of the {@code compareMask} field. */
	public int compareMask() { return ncompareMask(address()); }
	/** Returns the value of the {@code writeMask} field. */
	public int writeMask() { return nwriteMask(address()); }
	/** Returns the value of the {@code reference} field. */
	public int reference() { return nreference(address()); }

	/** Sets the specified value to the {@code failOp} field. */
	public VkStencilOpState failOp(int value) { nfailOp(address(), value); return this; }
	/** Sets the specified value to the {@code passOp} field. */
	public VkStencilOpState passOp(int value) { npassOp(address(), value); return this; }
	/** Sets the specified value to the {@code depthFailOp} field. */
	public VkStencilOpState depthFailOp(int value) { ndepthFailOp(address(), value); return this; }
	/** Sets the specified value to the {@code compareOp} field. */
	public VkStencilOpState compareOp(int value) { ncompareOp(address(), value); return this; }
	/** Sets the specified value to the {@code compareMask} field. */
	public VkStencilOpState compareMask(int value) { ncompareMask(address(), value); return this; }
	/** Sets the specified value to the {@code writeMask} field. */
	public VkStencilOpState writeMask(int value) { nwriteMask(address(), value); return this; }
	/** Sets the specified value to the {@code reference} field. */
	public VkStencilOpState reference(int value) { nreference(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkStencilOpState set(
		int failOp,
		int passOp,
		int depthFailOp,
		int compareOp,
		int compareMask,
		int writeMask,
		int reference
	) {
		failOp(failOp);
		passOp(passOp);
		depthFailOp(depthFailOp);
		compareOp(compareOp);
		compareMask(compareMask);
		writeMask(writeMask);
		reference(reference);

		return this;
	}

	/** Unsafe version of {@link #set(VkStencilOpState) set}. */
	public VkStencilOpState nset(long struct) {
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
	public VkStencilOpState set(VkStencilOpState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkStencilOpState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkStencilOpState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkStencilOpState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkStencilOpState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkStencilOpState} instance allocated with {@link BufferUtils}. */
	public static VkStencilOpState create() {
		return new VkStencilOpState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkStencilOpState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkStencilOpState create(long address) {
		return address == NULL ? null : new VkStencilOpState(address, null);
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkStencilOpState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkStencilOpState} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkStencilOpState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkStencilOpState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkStencilOpState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkStencilOpState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkStencilOpState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkStencilOpState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkStencilOpState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkStencilOpState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #failOp}. */
	public static int nfailOp(long struct) { return memGetInt(struct + VkStencilOpState.FAILOP); }
	/** Unsafe version of {@link #passOp}. */
	public static int npassOp(long struct) { return memGetInt(struct + VkStencilOpState.PASSOP); }
	/** Unsafe version of {@link #depthFailOp}. */
	public static int ndepthFailOp(long struct) { return memGetInt(struct + VkStencilOpState.DEPTHFAILOP); }
	/** Unsafe version of {@link #compareOp}. */
	public static int ncompareOp(long struct) { return memGetInt(struct + VkStencilOpState.COMPAREOP); }
	/** Unsafe version of {@link #compareMask}. */
	public static int ncompareMask(long struct) { return memGetInt(struct + VkStencilOpState.COMPAREMASK); }
	/** Unsafe version of {@link #writeMask}. */
	public static int nwriteMask(long struct) { return memGetInt(struct + VkStencilOpState.WRITEMASK); }
	/** Unsafe version of {@link #reference}. */
	public static int nreference(long struct) { return memGetInt(struct + VkStencilOpState.REFERENCE); }

	/** Unsafe version of {@link #failOp(int) failOp}. */
	public static void nfailOp(long struct, int value) { memPutInt(struct + VkStencilOpState.FAILOP, value); }
	/** Unsafe version of {@link #passOp(int) passOp}. */
	public static void npassOp(long struct, int value) { memPutInt(struct + VkStencilOpState.PASSOP, value); }
	/** Unsafe version of {@link #depthFailOp(int) depthFailOp}. */
	public static void ndepthFailOp(long struct, int value) { memPutInt(struct + VkStencilOpState.DEPTHFAILOP, value); }
	/** Unsafe version of {@link #compareOp(int) compareOp}. */
	public static void ncompareOp(long struct, int value) { memPutInt(struct + VkStencilOpState.COMPAREOP, value); }
	/** Unsafe version of {@link #compareMask(int) compareMask}. */
	public static void ncompareMask(long struct, int value) { memPutInt(struct + VkStencilOpState.COMPAREMASK, value); }
	/** Unsafe version of {@link #writeMask(int) writeMask}. */
	public static void nwriteMask(long struct, int value) { memPutInt(struct + VkStencilOpState.WRITEMASK, value); }
	/** Unsafe version of {@link #reference(int) reference}. */
	public static void nreference(long struct, int value) { memPutInt(struct + VkStencilOpState.REFERENCE, value); }

	// -----------------------------------

	/** An array of {@link VkStencilOpState} structs. */
	public static final class Buffer extends StructBuffer<VkStencilOpState, Buffer> {

		/**
		 * Creates a new {@link VkStencilOpState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkStencilOpState#SIZEOF}, and its mark will be undefined.
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
		protected VkStencilOpState newInstance(long address) {
			return new VkStencilOpState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code failOp} field. */
		public int failOp() { return VkStencilOpState.nfailOp(address()); }
		/** Returns the value of the {@code passOp} field. */
		public int passOp() { return VkStencilOpState.npassOp(address()); }
		/** Returns the value of the {@code depthFailOp} field. */
		public int depthFailOp() { return VkStencilOpState.ndepthFailOp(address()); }
		/** Returns the value of the {@code compareOp} field. */
		public int compareOp() { return VkStencilOpState.ncompareOp(address()); }
		/** Returns the value of the {@code compareMask} field. */
		public int compareMask() { return VkStencilOpState.ncompareMask(address()); }
		/** Returns the value of the {@code writeMask} field. */
		public int writeMask() { return VkStencilOpState.nwriteMask(address()); }
		/** Returns the value of the {@code reference} field. */
		public int reference() { return VkStencilOpState.nreference(address()); }

		/** Sets the specified value to the {@code failOp} field. */
		public VkStencilOpState.Buffer failOp(int value) { VkStencilOpState.nfailOp(address(), value); return this; }
		/** Sets the specified value to the {@code passOp} field. */
		public VkStencilOpState.Buffer passOp(int value) { VkStencilOpState.npassOp(address(), value); return this; }
		/** Sets the specified value to the {@code depthFailOp} field. */
		public VkStencilOpState.Buffer depthFailOp(int value) { VkStencilOpState.ndepthFailOp(address(), value); return this; }
		/** Sets the specified value to the {@code compareOp} field. */
		public VkStencilOpState.Buffer compareOp(int value) { VkStencilOpState.ncompareOp(address(), value); return this; }
		/** Sets the specified value to the {@code compareMask} field. */
		public VkStencilOpState.Buffer compareMask(int value) { VkStencilOpState.ncompareMask(address(), value); return this; }
		/** Sets the specified value to the {@code writeMask} field. */
		public VkStencilOpState.Buffer writeMask(int value) { VkStencilOpState.nwriteMask(address(), value); return this; }
		/** Sets the specified value to the {@code reference} field. */
		public VkStencilOpState.Buffer reference(int value) { VkStencilOpState.nreference(address(), value); return this; }

	}

}