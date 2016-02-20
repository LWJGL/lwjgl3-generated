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
 * struct VkAttachmentDescription {
 *     VkAttachmentDescriptionFlags flags;
 *     VkFormat format;
 *     VkSampleCountFlagBits samples;
 *     VkAttachmentLoadOp loadOp;
 *     VkAttachmentStoreOp storeOp;
 *     VkAttachmentLoadOp stencilLoadOp;
 *     VkAttachmentStoreOp stencilStoreOp;
 *     VkImageLayout initialLayout;
 *     VkImageLayout finalLayout;
 * }</code></pre>
 */
public class VkAttachmentDescription extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		FLAGS,
		FORMAT,
		SAMPLES,
		LOADOP,
		STOREOP,
		STENCILLOADOP,
		STENCILSTOREOP,
		INITIALLAYOUT,
		FINALLAYOUT;

	static {
		Layout layout = __struct(
			__member(4),
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

		FLAGS = layout.offsetof(0);
		FORMAT = layout.offsetof(1);
		SAMPLES = layout.offsetof(2);
		LOADOP = layout.offsetof(3);
		STOREOP = layout.offsetof(4);
		STENCILLOADOP = layout.offsetof(5);
		STENCILSTOREOP = layout.offsetof(6);
		INITIALLAYOUT = layout.offsetof(7);
		FINALLAYOUT = layout.offsetof(8);
	}

	VkAttachmentDescription(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkAttachmentDescription} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkAttachmentDescription(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code format} field. */
	public int format() { return nformat(address()); }
	/** Returns the value of the {@code samples} field. */
	public int samples() { return nsamples(address()); }
	/** Returns the value of the {@code loadOp} field. */
	public int loadOp() { return nloadOp(address()); }
	/** Returns the value of the {@code storeOp} field. */
	public int storeOp() { return nstoreOp(address()); }
	/** Returns the value of the {@code stencilLoadOp} field. */
	public int stencilLoadOp() { return nstencilLoadOp(address()); }
	/** Returns the value of the {@code stencilStoreOp} field. */
	public int stencilStoreOp() { return nstencilStoreOp(address()); }
	/** Returns the value of the {@code initialLayout} field. */
	public int initialLayout() { return ninitialLayout(address()); }
	/** Returns the value of the {@code finalLayout} field. */
	public int finalLayout() { return nfinalLayout(address()); }

	/** Sets the specified value to the {@code flags} field. */
	public VkAttachmentDescription flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code format} field. */
	public VkAttachmentDescription format(int value) { nformat(address(), value); return this; }
	/** Sets the specified value to the {@code samples} field. */
	public VkAttachmentDescription samples(int value) { nsamples(address(), value); return this; }
	/** Sets the specified value to the {@code loadOp} field. */
	public VkAttachmentDescription loadOp(int value) { nloadOp(address(), value); return this; }
	/** Sets the specified value to the {@code storeOp} field. */
	public VkAttachmentDescription storeOp(int value) { nstoreOp(address(), value); return this; }
	/** Sets the specified value to the {@code stencilLoadOp} field. */
	public VkAttachmentDescription stencilLoadOp(int value) { nstencilLoadOp(address(), value); return this; }
	/** Sets the specified value to the {@code stencilStoreOp} field. */
	public VkAttachmentDescription stencilStoreOp(int value) { nstencilStoreOp(address(), value); return this; }
	/** Sets the specified value to the {@code initialLayout} field. */
	public VkAttachmentDescription initialLayout(int value) { ninitialLayout(address(), value); return this; }
	/** Sets the specified value to the {@code finalLayout} field. */
	public VkAttachmentDescription finalLayout(int value) { nfinalLayout(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkAttachmentDescription set(
		int flags,
		int format,
		int samples,
		int loadOp,
		int storeOp,
		int stencilLoadOp,
		int stencilStoreOp,
		int initialLayout,
		int finalLayout
	) {
		flags(flags);
		format(format);
		samples(samples);
		loadOp(loadOp);
		storeOp(storeOp);
		stencilLoadOp(stencilLoadOp);
		stencilStoreOp(stencilStoreOp);
		initialLayout(initialLayout);
		finalLayout(finalLayout);

		return this;
	}

	/** Unsafe version of {@link #set(VkAttachmentDescription) set}. */
	public VkAttachmentDescription nset(long struct) {
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
	public VkAttachmentDescription set(VkAttachmentDescription src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkAttachmentDescription malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkAttachmentDescription calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance allocated with {@link BufferUtils}. */
	public static VkAttachmentDescription create() {
		return new VkAttachmentDescription(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkAttachmentDescription} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkAttachmentDescription create(long address) {
		return address == NULL ? null : new VkAttachmentDescription(address, null);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAttachmentDescription.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkAttachmentDescription.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkAttachmentDescription.FLAGS); }
	/** Unsafe version of {@link #format}. */
	public static int nformat(long struct) { return memGetInt(struct + VkAttachmentDescription.FORMAT); }
	/** Unsafe version of {@link #samples}. */
	public static int nsamples(long struct) { return memGetInt(struct + VkAttachmentDescription.SAMPLES); }
	/** Unsafe version of {@link #loadOp}. */
	public static int nloadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.LOADOP); }
	/** Unsafe version of {@link #storeOp}. */
	public static int nstoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STOREOP); }
	/** Unsafe version of {@link #stencilLoadOp}. */
	public static int nstencilLoadOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILLOADOP); }
	/** Unsafe version of {@link #stencilStoreOp}. */
	public static int nstencilStoreOp(long struct) { return memGetInt(struct + VkAttachmentDescription.STENCILSTOREOP); }
	/** Unsafe version of {@link #initialLayout}. */
	public static int ninitialLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.INITIALLAYOUT); }
	/** Unsafe version of {@link #finalLayout}. */
	public static int nfinalLayout(long struct) { return memGetInt(struct + VkAttachmentDescription.FINALLAYOUT); }

	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FLAGS, value); }
	/** Unsafe version of {@link #format(int) format}. */
	public static void nformat(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FORMAT, value); }
	/** Unsafe version of {@link #samples(int) samples}. */
	public static void nsamples(long struct, int value) { memPutInt(struct + VkAttachmentDescription.SAMPLES, value); }
	/** Unsafe version of {@link #loadOp(int) loadOp}. */
	public static void nloadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.LOADOP, value); }
	/** Unsafe version of {@link #storeOp(int) storeOp}. */
	public static void nstoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STOREOP, value); }
	/** Unsafe version of {@link #stencilLoadOp(int) stencilLoadOp}. */
	public static void nstencilLoadOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILLOADOP, value); }
	/** Unsafe version of {@link #stencilStoreOp(int) stencilStoreOp}. */
	public static void nstencilStoreOp(long struct, int value) { memPutInt(struct + VkAttachmentDescription.STENCILSTOREOP, value); }
	/** Unsafe version of {@link #initialLayout(int) initialLayout}. */
	public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.INITIALLAYOUT, value); }
	/** Unsafe version of {@link #finalLayout(int) finalLayout}. */
	public static void nfinalLayout(long struct, int value) { memPutInt(struct + VkAttachmentDescription.FINALLAYOUT, value); }

	// -----------------------------------

	/** An array of {@link VkAttachmentDescription} structs. */
	public static final class Buffer extends StructBuffer<VkAttachmentDescription, Buffer> {

		/**
		 * Creates a new {@link VkAttachmentDescription.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkAttachmentDescription#SIZEOF}, and its mark will be undefined.
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
		protected VkAttachmentDescription newInstance(long address) {
			return new VkAttachmentDescription(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkAttachmentDescription.nflags(address()); }
		/** Returns the value of the {@code format} field. */
		public int format() { return VkAttachmentDescription.nformat(address()); }
		/** Returns the value of the {@code samples} field. */
		public int samples() { return VkAttachmentDescription.nsamples(address()); }
		/** Returns the value of the {@code loadOp} field. */
		public int loadOp() { return VkAttachmentDescription.nloadOp(address()); }
		/** Returns the value of the {@code storeOp} field. */
		public int storeOp() { return VkAttachmentDescription.nstoreOp(address()); }
		/** Returns the value of the {@code stencilLoadOp} field. */
		public int stencilLoadOp() { return VkAttachmentDescription.nstencilLoadOp(address()); }
		/** Returns the value of the {@code stencilStoreOp} field. */
		public int stencilStoreOp() { return VkAttachmentDescription.nstencilStoreOp(address()); }
		/** Returns the value of the {@code initialLayout} field. */
		public int initialLayout() { return VkAttachmentDescription.ninitialLayout(address()); }
		/** Returns the value of the {@code finalLayout} field. */
		public int finalLayout() { return VkAttachmentDescription.nfinalLayout(address()); }

		/** Sets the specified value to the {@code flags} field. */
		public VkAttachmentDescription.Buffer flags(int value) { VkAttachmentDescription.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code format} field. */
		public VkAttachmentDescription.Buffer format(int value) { VkAttachmentDescription.nformat(address(), value); return this; }
		/** Sets the specified value to the {@code samples} field. */
		public VkAttachmentDescription.Buffer samples(int value) { VkAttachmentDescription.nsamples(address(), value); return this; }
		/** Sets the specified value to the {@code loadOp} field. */
		public VkAttachmentDescription.Buffer loadOp(int value) { VkAttachmentDescription.nloadOp(address(), value); return this; }
		/** Sets the specified value to the {@code storeOp} field. */
		public VkAttachmentDescription.Buffer storeOp(int value) { VkAttachmentDescription.nstoreOp(address(), value); return this; }
		/** Sets the specified value to the {@code stencilLoadOp} field. */
		public VkAttachmentDescription.Buffer stencilLoadOp(int value) { VkAttachmentDescription.nstencilLoadOp(address(), value); return this; }
		/** Sets the specified value to the {@code stencilStoreOp} field. */
		public VkAttachmentDescription.Buffer stencilStoreOp(int value) { VkAttachmentDescription.nstencilStoreOp(address(), value); return this; }
		/** Sets the specified value to the {@code initialLayout} field. */
		public VkAttachmentDescription.Buffer initialLayout(int value) { VkAttachmentDescription.ninitialLayout(address(), value); return this; }
		/** Sets the specified value to the {@code finalLayout} field. */
		public VkAttachmentDescription.Buffer finalLayout(int value) { VkAttachmentDescription.nfinalLayout(address(), value); return this; }

	}

}