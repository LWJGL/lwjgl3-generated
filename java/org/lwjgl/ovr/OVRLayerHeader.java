/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Defines properties shared by all ovrLayer structs, such as {@link OVRLayerEyeFov}.
 * 
 * <p>{@code ovrLayerHeader} is used as a base member in these larger structs. This struct cannot be used by itself except for the case that {@code Type} is
 * {@link OVR#ovrLayerType_Disabled}.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Type} &ndash; described by {@code ovrLayerType}. One of:<br><table><tr><td>{@link OVR#ovrLayerType_Disabled LayerType_Disabled}</td><td>{@link OVR#ovrLayerType_EyeFov LayerType_EyeFov}</td><td>{@link OVR#ovrLayerType_EyeMatrix LayerType_EyeMatrix}</td><td>{@link OVR#ovrLayerType_Quad LayerType_Quad}</td></tr></table></li>
 * <li>{@code Flags} &ndash; described by {@code ovrLayerFlags}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrLayerHeader {
    ovrLayerType Type;
    unsigned int Flags;
}</code></pre>
 */
public class OVRLayerHeader extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		FLAGS = layout.offsetof(1);
	}

	OVRLayerHeader(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRLayerHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerHeader(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code Type} field. */
	public int Type() { return nType(address()); }
	/** Returns the value of the {@code Flags} field. */
	public int Flags() { return nFlags(address()); }

	/** Sets the specified value to the {@code Type} field. */
	public OVRLayerHeader Type(int value) { nType(address(), value); return this; }
	/** Sets the specified value to the {@code Flags} field. */
	public OVRLayerHeader Flags(int value) { nFlags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerHeader set(
		int Type,
		int Flags
	) {
		Type(Type);
		Flags(Flags);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerHeader) set}. */
	public OVRLayerHeader nset(long struct) {
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
	public OVRLayerHeader set(OVRLayerHeader src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerHeader calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated with {@link BufferUtils}. */
	public static OVRLayerHeader create() {
		return new OVRLayerHeader(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRLayerHeader} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRLayerHeader create(long address) {
		return address == NULL ? null : new OVRLayerHeader(address, null);
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRLayerHeader.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerHeader} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRLayerHeader mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRLayerHeader} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRLayerHeader callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerHeader} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerHeader mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerHeader callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Type}. */
	public static int nType(long struct) { return memGetInt(struct + OVRLayerHeader.TYPE); }
	/** Unsafe version of {@link #Flags}. */
	public static int nFlags(long struct) { return memGetInt(struct + OVRLayerHeader.FLAGS); }

	/** Unsafe version of {@link #Type(int) Type}. */
	public static void nType(long struct, int value) { memPutInt(struct + OVRLayerHeader.TYPE, value); }
	/** Unsafe version of {@link #Flags(int) Flags}. */
	public static void nFlags(long struct, int value) { memPutInt(struct + OVRLayerHeader.FLAGS, value); }

	// -----------------------------------

	/** An array of {@link OVRLayerHeader} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerHeader, Buffer> {

		/**
		 * Creates a new {@link OVRLayerHeader.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerHeader#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerHeader newInstance(long address) {
			return new OVRLayerHeader(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Type} field. */
		public int Type() { return OVRLayerHeader.nType(address()); }
		/** Returns the value of the {@code Flags} field. */
		public int Flags() { return OVRLayerHeader.nFlags(address()); }

		/** Sets the specified value to the {@code Type} field. */
		public OVRLayerHeader.Buffer Type(int value) { OVRLayerHeader.nType(address(), value); return this; }
		/** Sets the specified value to the {@code Flags} field. */
		public OVRLayerHeader.Buffer Flags(int value) { OVRLayerHeader.nFlags(address(), value); return this; }

	}

}