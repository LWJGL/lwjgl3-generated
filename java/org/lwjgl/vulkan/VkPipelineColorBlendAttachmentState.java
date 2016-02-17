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

/**
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct VkPipelineColorBlendAttachmentState {
 *     VkBool32 blendEnable;
 *     VkBlendFactor srcColorBlendFactor;
 *     VkBlendFactor dstColorBlendFactor;
 *     VkBlendOp colorBlendOp;
 *     VkBlendFactor srcAlphaBlendFactor;
 *     VkBlendFactor dstAlphaBlendFactor;
 *     VkBlendOp alphaBlendOp;
 *     VkColorComponentFlags colorWriteMask;
 * }</code></pre>
 */
public class VkPipelineColorBlendAttachmentState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		BLENDENABLE,
		SRCCOLORBLENDFACTOR,
		DSTCOLORBLENDFACTOR,
		COLORBLENDOP,
		SRCALPHABLENDFACTOR,
		DSTALPHABLENDFACTOR,
		ALPHABLENDOP,
		COLORWRITEMASK;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		BLENDENABLE = layout.offsetof(0);
		SRCCOLORBLENDFACTOR = layout.offsetof(1);
		DSTCOLORBLENDFACTOR = layout.offsetof(2);
		COLORBLENDOP = layout.offsetof(3);
		SRCALPHABLENDFACTOR = layout.offsetof(4);
		DSTALPHABLENDFACTOR = layout.offsetof(5);
		ALPHABLENDOP = layout.offsetof(6);
		COLORWRITEMASK = layout.offsetof(7);
	}

	VkPipelineColorBlendAttachmentState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineColorBlendAttachmentState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineColorBlendAttachmentState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code blendEnable} field. */
	public int blendEnable() { return nblendEnable(address()); }
	/** Returns the value of the {@code srcColorBlendFactor} field. */
	public int srcColorBlendFactor() { return nsrcColorBlendFactor(address()); }
	/** Returns the value of the {@code dstColorBlendFactor} field. */
	public int dstColorBlendFactor() { return ndstColorBlendFactor(address()); }
	/** Returns the value of the {@code colorBlendOp} field. */
	public int colorBlendOp() { return ncolorBlendOp(address()); }
	/** Returns the value of the {@code srcAlphaBlendFactor} field. */
	public int srcAlphaBlendFactor() { return nsrcAlphaBlendFactor(address()); }
	/** Returns the value of the {@code dstAlphaBlendFactor} field. */
	public int dstAlphaBlendFactor() { return ndstAlphaBlendFactor(address()); }
	/** Returns the value of the {@code alphaBlendOp} field. */
	public int alphaBlendOp() { return nalphaBlendOp(address()); }
	/** Returns the value of the {@code colorWriteMask} field. */
	public int colorWriteMask() { return ncolorWriteMask(address()); }

	/** Sets the specified value to the {@code blendEnable} field. */
	public VkPipelineColorBlendAttachmentState blendEnable(int value) { nblendEnable(address(), value); return this; }
	/** Sets the specified value to the {@code srcColorBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState srcColorBlendFactor(int value) { nsrcColorBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code dstColorBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState dstColorBlendFactor(int value) { ndstColorBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code colorBlendOp} field. */
	public VkPipelineColorBlendAttachmentState colorBlendOp(int value) { ncolorBlendOp(address(), value); return this; }
	/** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int value) { nsrcAlphaBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int value) { ndstAlphaBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code alphaBlendOp} field. */
	public VkPipelineColorBlendAttachmentState alphaBlendOp(int value) { nalphaBlendOp(address(), value); return this; }
	/** Sets the specified value to the {@code colorWriteMask} field. */
	public VkPipelineColorBlendAttachmentState colorWriteMask(int value) { ncolorWriteMask(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineColorBlendAttachmentState set(
		int blendEnable,
		int srcColorBlendFactor,
		int dstColorBlendFactor,
		int colorBlendOp,
		int srcAlphaBlendFactor,
		int dstAlphaBlendFactor,
		int alphaBlendOp,
		int colorWriteMask
	) {
		blendEnable(blendEnable);
		srcColorBlendFactor(srcColorBlendFactor);
		dstColorBlendFactor(dstColorBlendFactor);
		colorBlendOp(colorBlendOp);
		srcAlphaBlendFactor(srcAlphaBlendFactor);
		dstAlphaBlendFactor(dstAlphaBlendFactor);
		alphaBlendOp(alphaBlendOp);
		colorWriteMask(colorWriteMask);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineColorBlendAttachmentState) set}. */
	public VkPipelineColorBlendAttachmentState nset(long struct) {
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
	public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkPipelineColorBlendAttachmentState) set}. */
	public VkPipelineColorBlendAttachmentState set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineColorBlendAttachmentState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineColorBlendAttachmentState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link BufferUtils}. */
	public static VkPipelineColorBlendAttachmentState create() {
		return new VkPipelineColorBlendAttachmentState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineColorBlendAttachmentState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineColorBlendAttachmentState create(long address) {
		return address == NULL ? null : new VkPipelineColorBlendAttachmentState(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineColorBlendAttachmentState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #blendEnable}. */
	public static int nblendEnable(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE); }
	/** Unsafe version of {@link #srcColorBlendFactor}. */
	public static int nsrcColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR); }
	/** Unsafe version of {@link #dstColorBlendFactor}. */
	public static int ndstColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR); }
	/** Unsafe version of {@link #colorBlendOp}. */
	public static int ncolorBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP); }
	/** Unsafe version of {@link #srcAlphaBlendFactor}. */
	public static int nsrcAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR); }
	/** Unsafe version of {@link #dstAlphaBlendFactor}. */
	public static int ndstAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR); }
	/** Unsafe version of {@link #alphaBlendOp}. */
	public static int nalphaBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP); }
	/** Unsafe version of {@link #colorWriteMask}. */
	public static int ncolorWriteMask(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK); }

	/** Unsafe version of {@link #blendEnable(int) blendEnable}. */
	public static void nblendEnable(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE, value); }
	/** Unsafe version of {@link #srcColorBlendFactor(int) srcColorBlendFactor}. */
	public static void nsrcColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR, value); }
	/** Unsafe version of {@link #dstColorBlendFactor(int) dstColorBlendFactor}. */
	public static void ndstColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR, value); }
	/** Unsafe version of {@link #colorBlendOp(int) colorBlendOp}. */
	public static void ncolorBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP, value); }
	/** Unsafe version of {@link #srcAlphaBlendFactor(int) srcAlphaBlendFactor}. */
	public static void nsrcAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR, value); }
	/** Unsafe version of {@link #dstAlphaBlendFactor(int) dstAlphaBlendFactor}. */
	public static void ndstAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR, value); }
	/** Unsafe version of {@link #alphaBlendOp(int) alphaBlendOp}. */
	public static void nalphaBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP, value); }
	/** Unsafe version of {@link #colorWriteMask(int) colorWriteMask}. */
	public static void ncolorWriteMask(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineColorBlendAttachmentState} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineColorBlendAttachmentState, Buffer> {

		/**
		 * Creates a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineColorBlendAttachmentState#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineColorBlendAttachmentState newInstance(long address) {
			return new VkPipelineColorBlendAttachmentState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code blendEnable} field. */
		public int blendEnable() { return VkPipelineColorBlendAttachmentState.nblendEnable(address()); }
		/** Returns the value of the {@code srcColorBlendFactor} field. */
		public int srcColorBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address()); }
		/** Returns the value of the {@code dstColorBlendFactor} field. */
		public int dstColorBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address()); }
		/** Returns the value of the {@code colorBlendOp} field. */
		public int colorBlendOp() { return VkPipelineColorBlendAttachmentState.ncolorBlendOp(address()); }
		/** Returns the value of the {@code srcAlphaBlendFactor} field. */
		public int srcAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address()); }
		/** Returns the value of the {@code dstAlphaBlendFactor} field. */
		public int dstAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address()); }
		/** Returns the value of the {@code alphaBlendOp} field. */
		public int alphaBlendOp() { return VkPipelineColorBlendAttachmentState.nalphaBlendOp(address()); }
		/** Returns the value of the {@code colorWriteMask} field. */
		public int colorWriteMask() { return VkPipelineColorBlendAttachmentState.ncolorWriteMask(address()); }

		/** Sets the specified value to the {@code blendEnable} field. */
		public VkPipelineColorBlendAttachmentState.Buffer blendEnable(int value) { VkPipelineColorBlendAttachmentState.nblendEnable(address(), value); return this; }
		/** Sets the specified value to the {@code srcColorBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer srcColorBlendFactor(int value) { VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code dstColorBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer dstColorBlendFactor(int value) { VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code colorBlendOp} field. */
		public VkPipelineColorBlendAttachmentState.Buffer colorBlendOp(int value) { VkPipelineColorBlendAttachmentState.ncolorBlendOp(address(), value); return this; }
		/** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer srcAlphaBlendFactor(int value) { VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer dstAlphaBlendFactor(int value) { VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code alphaBlendOp} field. */
		public VkPipelineColorBlendAttachmentState.Buffer alphaBlendOp(int value) { VkPipelineColorBlendAttachmentState.nalphaBlendOp(address(), value); return this; }
		/** Sets the specified value to the {@code colorWriteMask} field. */
		public VkPipelineColorBlendAttachmentState.Buffer colorWriteMask(int value) { VkPipelineColorBlendAttachmentState.ncolorWriteMask(address(), value); return this; }

	}

}