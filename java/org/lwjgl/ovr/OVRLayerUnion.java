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

/**
 * Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * union ovrLayer_Union {
 *     {@link OVRLayerHeader ovrLayerHeader} Header;
 *     {@link OVRLayerEyeFov ovrLayerEyeFov} EyeFov;
 *     {@link OVRLayerEyeFovDepth ovrLayerEyeFovDepth} EyeFovDepth;
 *     {@link OVRLayerQuad ovrLayerQuad} Quad;
 *     {@link OVRLayerDirect ovrLayerDirect} Direct;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>Header</td><td>the layer header</td></tr>
 * </table>
 */
public class OVRLayerUnion extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADER,
		EYEFOV,
		EYEFOVDEPTH,
		QUAD,
		DIRECT;

	static {
		Layout layout = __union(
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.__ALIGNMENT),
			__member(OVRLayerEyeFov.SIZEOF, OVRLayerEyeFov.__ALIGNMENT),
			__member(OVRLayerEyeFovDepth.SIZEOF, OVRLayerEyeFovDepth.__ALIGNMENT),
			__member(OVRLayerQuad.SIZEOF, OVRLayerQuad.__ALIGNMENT),
			__member(OVRLayerDirect.SIZEOF, OVRLayerDirect.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADER = layout.offsetof(0);
		EYEFOV = layout.offsetof(1);
		EYEFOVDEPTH = layout.offsetof(2);
		QUAD = layout.offsetof(3);
		DIRECT = layout.offsetof(4);
	}

	OVRLayerUnion(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRLayerUnion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerUnion(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
	public OVRLayerEyeFov EyeFov() { return nEyeFov(address()); }
	/** Returns a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
	public OVRLayerEyeFovDepth EyeFovDepth() { return nEyeFovDepth(address()); }
	/** Returns a {@link OVRLayerQuad} view of the {@code Quad} field. */
	public OVRLayerQuad Quad() { return nQuad(address()); }
	/** Returns a {@link OVRLayerDirect} view of the {@code Direct} field. */
	public OVRLayerDirect Direct() { return nDirect(address()); }

	/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
	public OVRLayerUnion Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
	/** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
	public OVRLayerUnion EyeFov(OVRLayerEyeFov value) { nEyeFov(address(), value); return this; }
	/** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
	public OVRLayerUnion EyeFovDepth(OVRLayerEyeFovDepth value) { nEyeFovDepth(address(), value); return this; }
	/** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
	public OVRLayerUnion Quad(OVRLayerQuad value) { nQuad(address(), value); return this; }
	/** Copies the specified {@link OVRLayerDirect} to the {@code Direct} field. */
	public OVRLayerUnion Direct(OVRLayerDirect value) { nDirect(address(), value); return this; }

	/** Unsafe version of {@link #set(OVRLayerUnion) set}. */
	public OVRLayerUnion nset(long struct) {
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
	public OVRLayerUnion set(OVRLayerUnion src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerUnion malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerUnion calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerUnion} instance allocated with {@link BufferUtils}. */
	public static OVRLayerUnion create() {
		return new OVRLayerUnion(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRLayerUnion} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRLayerUnion create(long address) {
		return address == NULL ? null : new OVRLayerUnion(address, null);
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRLayerUnion.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerUnion.HEADER); }
	/** Unsafe version of {@link #EyeFov}. */
	public static OVRLayerEyeFov nEyeFov(long struct) { return OVRLayerEyeFov.create(struct + OVRLayerUnion.EYEFOV); }
	/** Unsafe version of {@link #EyeFovDepth}. */
	public static OVRLayerEyeFovDepth nEyeFovDepth(long struct) { return OVRLayerEyeFovDepth.create(struct + OVRLayerUnion.EYEFOVDEPTH); }
	/** Unsafe version of {@link #Quad}. */
	public static OVRLayerQuad nQuad(long struct) { return OVRLayerQuad.create(struct + OVRLayerUnion.QUAD); }
	/** Unsafe version of {@link #Direct}. */
	public static OVRLayerDirect nDirect(long struct) { return OVRLayerDirect.create(struct + OVRLayerUnion.DIRECT); }

	/** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
	public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerUnion.HEADER, OVRLayerHeader.SIZEOF); }
	/** Unsafe version of {@link #EyeFov(OVRLayerEyeFov) EyeFov}. */
	public static void nEyeFov(long struct, OVRLayerEyeFov value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOV, OVRLayerEyeFov.SIZEOF); }
	/** Unsafe version of {@link #EyeFovDepth(OVRLayerEyeFovDepth) EyeFovDepth}. */
	public static void nEyeFovDepth(long struct, OVRLayerEyeFovDepth value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOVDEPTH, OVRLayerEyeFovDepth.SIZEOF); }
	/** Unsafe version of {@link #Quad(OVRLayerQuad) Quad}. */
	public static void nQuad(long struct, OVRLayerQuad value) { memCopy(value.address(), struct + OVRLayerUnion.QUAD, OVRLayerQuad.SIZEOF); }
	/** Unsafe version of {@link #Direct(OVRLayerDirect) Direct}. */
	public static void nDirect(long struct, OVRLayerDirect value) { memCopy(value.address(), struct + OVRLayerUnion.DIRECT, OVRLayerDirect.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRLayerUnion} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerUnion, Buffer> {

		/**
		 * Creates a new {@link OVRLayerUnion.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerUnion#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerUnion newInstance(long address) {
			return new OVRLayerUnion(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return OVRLayerUnion.nHeader(address()); }
		/** Returns a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
		public OVRLayerEyeFov EyeFov() { return OVRLayerUnion.nEyeFov(address()); }
		/** Returns a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
		public OVRLayerEyeFovDepth EyeFovDepth() { return OVRLayerUnion.nEyeFovDepth(address()); }
		/** Returns a {@link OVRLayerQuad} view of the {@code Quad} field. */
		public OVRLayerQuad Quad() { return OVRLayerUnion.nQuad(address()); }
		/** Returns a {@link OVRLayerDirect} view of the {@code Direct} field. */
		public OVRLayerDirect Direct() { return OVRLayerUnion.nDirect(address()); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerUnion.Buffer Header(OVRLayerHeader value) { OVRLayerUnion.nHeader(address(), value); return this; }
		/** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
		public OVRLayerUnion.Buffer EyeFov(OVRLayerEyeFov value) { OVRLayerUnion.nEyeFov(address(), value); return this; }
		/** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
		public OVRLayerUnion.Buffer EyeFovDepth(OVRLayerEyeFovDepth value) { OVRLayerUnion.nEyeFovDepth(address(), value); return this; }
		/** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
		public OVRLayerUnion.Buffer Quad(OVRLayerQuad value) { OVRLayerUnion.nQuad(address(), value); return this; }
		/** Copies the specified {@link OVRLayerDirect} to the {@code Direct} field. */
		public OVRLayerUnion.Buffer Direct(OVRLayerDirect value) { OVRLayerUnion.nDirect(address(), value); return this; }

	}

}