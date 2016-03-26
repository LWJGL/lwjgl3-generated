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
 * Describes a layer which is copied to the HMD as-is. Neither distortion, time warp, nor vignetting is applied to {@code ColorTexture} before it's copied
 * to the HMD. The application can, however implement these kinds of effects itself before submitting the layer. This layer can be used for
 * application-based distortion rendering and can also be used for implementing a debug HUD that's viewed on the mirror texture.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrLayerDirect {
    {@link OVRLayerHeader ovrLayerHeader} Header;
    ovrSwapTextureSet *[2] ColorTexture;
    {@link OVRRecti ovrRecti}[2] Viewport;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Header</td><td>{@code Header.Type} must be {@link OVR#ovrLayerType_Direct}</td></tr>
 * <tr><td>ColorTexture</td><td>{@code ovrSwapTextureSets} for the left and right eye respectively. The second one of which can be {@code NULL}.</td></tr>
 * <tr><td>Viewport</td><td>specifies the {@code ColorTexture} sub-rect UV coordinates. Both {@code Viewport[0]} and {@code Viewport[1]} must be valid.</td></tr>
 * </table>
 */
public class OVRLayerDirect extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		HEADER,
		COLORTEXTURE,
		VIEWPORT;

	static {
		Layout layout = __struct(
			__member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
			__array(POINTER_SIZE, 2),
			__array(OVRRecti.SIZEOF, OVRRecti.ALIGNOF, 2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		HEADER = layout.offsetof(0);
		COLORTEXTURE = layout.offsetof(1);
		VIEWPORT = layout.offsetof(2);
	}

	OVRLayerDirect(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRLayerDirect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRLayerDirect(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
	public OVRLayerHeader Header() { return nHeader(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
	public PointerBuffer ColorTexture() { return nColorTexture(address()); }
	/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
	public OVRSwapTextureSet ColorTexture(int index) { return nColorTexture(address(), index); }
	/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
	public OVRRecti.Buffer Viewport() { return nViewport(address()); }
	/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
	public OVRRecti Viewport(int index) { return nViewport(address(), index); }

	/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
	public OVRLayerDirect Header(OVRLayerHeader value) { nHeader(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
	public OVRLayerDirect ColorTexture(PointerBuffer value) { nColorTexture(address(), value); return this; }
	/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
	public OVRLayerDirect ColorTexture(int index, OVRSwapTextureSet value) { nColorTexture(address(), index, value); return this; }
	/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
	public OVRLayerDirect Viewport(OVRRecti.Buffer value) { nViewport(address(), value); return this; }
	/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
	public OVRLayerDirect Viewport(int index, OVRRecti value) { nViewport(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRLayerDirect set(
		OVRLayerHeader Header,
		PointerBuffer ColorTexture,
		OVRRecti.Buffer Viewport
	) {
		Header(Header);
		ColorTexture(ColorTexture);
		Viewport(Viewport);

		return this;
	}

	/** Unsafe version of {@link #set(OVRLayerDirect) set}. */
	public OVRLayerDirect nset(long struct) {
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
	public OVRLayerDirect set(OVRLayerDirect src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRLayerDirect malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRLayerDirect calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRLayerDirect} instance allocated with {@link BufferUtils}. */
	public static OVRLayerDirect create() {
		return new OVRLayerDirect(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRLayerDirect} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRLayerDirect create(long address) {
		return address == NULL ? null : new OVRLayerDirect(address, null);
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRLayerDirect.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRLayerDirect} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRLayerDirect mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRLayerDirect} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRLayerDirect callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerDirect} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerDirect mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerDirect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRLayerDirect callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRLayerDirect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Header}. */
	public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerDirect.HEADER); }
	/** Unsafe version of {@link #ColorTexture}. */
	public static PointerBuffer nColorTexture(long struct) {
		return memPointerBuffer(struct + OVRLayerDirect.COLORTEXTURE, 2);
	}
	/** Unsafe version of {@link #ColorTexture(int) ColorTexture}. */
	public static OVRSwapTextureSet nColorTexture(long struct, int index) {
		return OVRSwapTextureSet.create(memGetAddress(struct + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #Viewport}. */
	public static OVRRecti.Buffer nViewport(long struct) {
		return OVRRecti.create(struct + OVRLayerDirect.VIEWPORT, 2);
	}
	/** Unsafe version of {@link #Viewport(int) Viewport}. */
	public static OVRRecti nViewport(long struct, int index) {
		return OVRRecti.create(struct + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF);
	}

	/** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
	public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerDirect.HEADER, OVRLayerHeader.SIZEOF); }
	/** Unsafe version of {@link #ColorTexture(PointerBuffer) ColorTexture}. */
	public static void nColorTexture(long struct, PointerBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRLayerDirect.COLORTEXTURE, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #ColorTexture(int, OVRSwapTextureSet) ColorTexture}. */
	public static void nColorTexture(long struct, int index, OVRSwapTextureSet value) { memPutAddress(struct + OVRLayerDirect.COLORTEXTURE + index * POINTER_SIZE, addressSafe(value)); }
	/** Unsafe version of {@link #Viewport(OVRRecti.Buffer) Viewport}. */
	public static void nViewport(long struct, OVRRecti.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRLayerDirect.VIEWPORT, value.remaining() * OVRRecti.SIZEOF);
	}
	/** Unsafe version of {@link #Viewport(int, OVRRecti) Viewport}. */
	public static void nViewport(long struct, int index, OVRRecti value) { memCopy(value.address(), struct + OVRLayerDirect.VIEWPORT + index * OVRRecti.SIZEOF, OVRRecti.SIZEOF); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		long ColorTexture = struct + OVRLayerDirect.COLORTEXTURE;
		for ( int i = 0; i < 2; i++ ) {
		   if ( i < 1 )
		       checkPointer(memGetAddress(ColorTexture));
		   else if ( memGetAddress(ColorTexture) == NULL )
		       break;
		   OVRSwapTextureSet.validate(ColorTexture);
		   ColorTexture += POINTER_SIZE;
		}
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link OVRLayerDirect} structs. */
	public static final class Buffer extends StructBuffer<OVRLayerDirect, Buffer> {

		/**
		 * Creates a new {@link OVRLayerDirect.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRLayerDirect#SIZEOF}, and its mark will be undefined.
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
		protected OVRLayerDirect newInstance(long address) {
			return new OVRLayerDirect(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
		public OVRLayerHeader Header() { return OVRLayerDirect.nHeader(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code ColorTexture} field. */
		public PointerBuffer ColorTexture() { return OVRLayerDirect.nColorTexture(address()); }
		/** Returns a {@link OVRSwapTextureSet} view of the pointer at the specified index of the {@code ColorTexture}. */
		public OVRSwapTextureSet ColorTexture(int index) { return OVRLayerDirect.nColorTexture(address(), index); }
		/** Returns a {@link OVRRecti}.Buffer view of the {@code Viewport} field. */
		public OVRRecti.Buffer Viewport() { return OVRLayerDirect.nViewport(address()); }
		/** Returns a {@link OVRRecti} view of the struct at the specified index of the {@code Viewport} field. */
		public OVRRecti Viewport(int index) { return OVRLayerDirect.nViewport(address(), index); }

		/** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
		public OVRLayerDirect.Buffer Header(OVRLayerHeader value) { OVRLayerDirect.nHeader(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code ColorTexture} field. */
		public OVRLayerDirect.Buffer ColorTexture(PointerBuffer value) { OVRLayerDirect.nColorTexture(address(), value); return this; }
		/** Copies the address of the specified {@link OVRSwapTextureSet} at the specified index of the {@code ColorTexture} field. */
		public OVRLayerDirect.Buffer ColorTexture(int index, OVRSwapTextureSet value) { OVRLayerDirect.nColorTexture(address(), index, value); return this; }
		/** Copies the specified {@link OVRRecti.Buffer} to the {@code Viewport} field. */
		public OVRLayerDirect.Buffer Viewport(OVRRecti.Buffer value) { OVRLayerDirect.nViewport(address(), value); return this; }
		/** Copies the specified {@link OVRRecti} at the specified index of the {@code Viewport} field. */
		public OVRLayerDirect.Buffer Viewport(int index, OVRRecti value) { OVRLayerDirect.nViewport(address(), index, value); return this; }

	}

}