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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplaySurfaceCreateInfoKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplaySurfaceCreateInfoKHR">Vulkan Specification</a>
 * 
 * <p>Contains information about how a display surface should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code displayMode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
 * <li>{@code transform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
 * <li>{@code alphaMode} <b>must</b> be a valid {@code VkDisplayPlaneAlphaFlagBitsKHR} value</li>
 * <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling
 * {@link KHRDisplay#vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR}</li>
 * <li>If the {@code planeReorderPossible} member of the {@link VkDisplayPropertiesKHR} structure returned by {@link KHRDisplay#vkGetPhysicalDeviceDisplayPropertiesKHR GetPhysicalDeviceDisplayPropertiesKHR} for the
 * display corresponding to {@code displayMode} is {@link VK10#VK_TRUE TRUE} then {@code planeStackIndex} <b>must</b> be less than the number of display planes supported by the
 * device as determined by calling {@link KHRDisplay#vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR}; otherwise {@code planeStackIndex} <b>must</b> equal the
 * {@code currentStackIndex} member of {@code VkDisplayPlanePropertiesKHR} returned by {@link KHRDisplay#vkGetPhysicalDeviceDisplayPlanePropertiesKHR GetPhysicalDeviceDisplayPlanePropertiesKHR} for the display
 * plane corresponding to {@code displayMode}</li>
 * <li>If {@code alphaMode} is {@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR} then {@code globalAlpha} <b>must</b> be between 0 and 1, inclusive</li>
 * <li>{@code alphaMode} <b>must</b> be 0 or one of the bits present in the {@code supportedAlpha} member of {@code VkDisplayPlaneCapabilitiesKHR} returned by
 * {@link KHRDisplay#vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR} for the display plane corresponding to {@code displayMode}</li>
 * <li>The {@code width} and {@code height} members of {@code imageExtent} <b>must</b> be less than the {@code maxImageDimensions2D} member of
 * {@code VkPhysicalDeviceLimits}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link KHRDisplay#VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use, and <b>must</b> be zero</li>
 * <li>{@code displayMode} &ndash; the mode to use when displaying this surface</li>
 * <li>{@code planeIndex} &ndash; the plane on which this surface appears</li>
 * <li>{@code planeStackIndex} &ndash; the z-order of the plane</li>
 * <li>{@code transform} &ndash; the transform to apply to the images as part of the scannout operation. One of:<br><table><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR SURFACE_TRANSFORM_INHERIT_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}</td></tr><tr><td>{@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}</td></tr></table></li>
 * <li>{@code globalAlpha} &ndash; the global alpha value. This value is ignored if {@code alphaMode} is not {@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR}.</li>
 * <li>{@code alphaMode} &ndash; the type of alpha blending to use. One of:<br><table><tr><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR}</td><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR}</td></tr><tr><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR}</td><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR}</td></tr></table></li>
 * <li>{@code imageExtent} &ndash; the size of the presentable images to use with the surface</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplaySurfaceCreateInfoKHR {
    VkStructureType sType;
    const void * pNext;
    VkDisplaySurfaceCreateFlagsKHR flags;
    VkDisplayModeKHR displayMode;
    uint32_t planeIndex;
    uint32_t planeStackIndex;
    VkSurfaceTransformFlagBitsKHR transform;
    float globalAlpha;
    VkDisplayPlaneAlphaFlagBitsKHR alphaMode;
    {@link VkExtent2D VkExtent2D} imageExtent;
}</code></pre>
 */
public class VkDisplaySurfaceCreateInfoKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		DISPLAYMODE,
		PLANEINDEX,
		PLANESTACKINDEX,
		TRANSFORM,
		GLOBALALPHA,
		ALPHAMODE,
		IMAGEEXTENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		DISPLAYMODE = layout.offsetof(3);
		PLANEINDEX = layout.offsetof(4);
		PLANESTACKINDEX = layout.offsetof(5);
		TRANSFORM = layout.offsetof(6);
		GLOBALALPHA = layout.offsetof(7);
		ALPHAMODE = layout.offsetof(8);
		IMAGEEXTENT = layout.offsetof(9);
	}

	VkDisplaySurfaceCreateInfoKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplaySurfaceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplaySurfaceCreateInfoKHR(ByteBuffer container) {
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
	/** Returns the value of the {@code displayMode} field. */
	public long displayMode() { return ndisplayMode(address()); }
	/** Returns the value of the {@code planeIndex} field. */
	public int planeIndex() { return nplaneIndex(address()); }
	/** Returns the value of the {@code planeStackIndex} field. */
	public int planeStackIndex() { return nplaneStackIndex(address()); }
	/** Returns the value of the {@code transform} field. */
	public int transform() { return ntransform(address()); }
	/** Returns the value of the {@code globalAlpha} field. */
	public float globalAlpha() { return nglobalAlpha(address()); }
	/** Returns the value of the {@code alphaMode} field. */
	public int alphaMode() { return nalphaMode(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
	public VkExtent2D imageExtent() { return nimageExtent(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDisplaySurfaceCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDisplaySurfaceCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDisplaySurfaceCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code displayMode} field. */
	public VkDisplaySurfaceCreateInfoKHR displayMode(long value) { ndisplayMode(address(), value); return this; }
	/** Sets the specified value to the {@code planeIndex} field. */
	public VkDisplaySurfaceCreateInfoKHR planeIndex(int value) { nplaneIndex(address(), value); return this; }
	/** Sets the specified value to the {@code planeStackIndex} field. */
	public VkDisplaySurfaceCreateInfoKHR planeStackIndex(int value) { nplaneStackIndex(address(), value); return this; }
	/** Sets the specified value to the {@code transform} field. */
	public VkDisplaySurfaceCreateInfoKHR transform(int value) { ntransform(address(), value); return this; }
	/** Sets the specified value to the {@code globalAlpha} field. */
	public VkDisplaySurfaceCreateInfoKHR globalAlpha(float value) { nglobalAlpha(address(), value); return this; }
	/** Sets the specified value to the {@code alphaMode} field. */
	public VkDisplaySurfaceCreateInfoKHR alphaMode(int value) { nalphaMode(address(), value); return this; }
	/** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
	public VkDisplaySurfaceCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDisplaySurfaceCreateInfoKHR set(
		int sType,
		long pNext,
		int flags,
		long displayMode,
		int planeIndex,
		int planeStackIndex,
		int transform,
		float globalAlpha,
		int alphaMode,
		VkExtent2D imageExtent
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		displayMode(displayMode);
		planeIndex(planeIndex);
		planeStackIndex(planeStackIndex);
		transform(transform);
		globalAlpha(globalAlpha);
		alphaMode(alphaMode);
		imageExtent(imageExtent);

		return this;
	}

	/** Unsafe version of {@link #set(VkDisplaySurfaceCreateInfoKHR) set}. */
	public VkDisplaySurfaceCreateInfoKHR nset(long struct) {
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
	public VkDisplaySurfaceCreateInfoKHR set(VkDisplaySurfaceCreateInfoKHR src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplaySurfaceCreateInfoKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplaySurfaceCreateInfoKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplaySurfaceCreateInfoKHR create() {
		return new VkDisplaySurfaceCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplaySurfaceCreateInfoKHR create(long address) {
		return address == NULL ? null : new VkDisplaySurfaceCreateInfoKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplaySurfaceCreateInfoKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplaySurfaceCreateInfoKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplaySurfaceCreateInfoKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplaySurfaceCreateInfoKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.FLAGS); }
	/** Unsafe version of {@link #displayMode}. */
	public static long ndisplayMode(long struct) { return memGetLong(struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE); }
	/** Unsafe version of {@link #planeIndex}. */
	public static int nplaneIndex(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX); }
	/** Unsafe version of {@link #planeStackIndex}. */
	public static int nplaneStackIndex(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX); }
	/** Unsafe version of {@link #transform}. */
	public static int ntransform(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM); }
	/** Unsafe version of {@link #globalAlpha}. */
	public static float nglobalAlpha(long struct) { return memGetFloat(struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA); }
	/** Unsafe version of {@link #alphaMode}. */
	public static int nalphaMode(long struct) { return memGetInt(struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE); }
	/** Unsafe version of {@link #imageExtent}. */
	public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplaySurfaceCreateInfoKHR.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.FLAGS, value); }
	/** Unsafe version of {@link #displayMode(long) displayMode}. */
	public static void ndisplayMode(long struct, long value) { memPutLong(struct + VkDisplaySurfaceCreateInfoKHR.DISPLAYMODE, value); }
	/** Unsafe version of {@link #planeIndex(int) planeIndex}. */
	public static void nplaneIndex(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANEINDEX, value); }
	/** Unsafe version of {@link #planeStackIndex(int) planeStackIndex}. */
	public static void nplaneStackIndex(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.PLANESTACKINDEX, value); }
	/** Unsafe version of {@link #transform(int) transform}. */
	public static void ntransform(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.TRANSFORM, value); }
	/** Unsafe version of {@link #globalAlpha(float) globalAlpha}. */
	public static void nglobalAlpha(long struct, float value) { memPutFloat(struct + VkDisplaySurfaceCreateInfoKHR.GLOBALALPHA, value); }
	/** Unsafe version of {@link #alphaMode(int) alphaMode}. */
	public static void nalphaMode(long struct, int value) { memPutInt(struct + VkDisplaySurfaceCreateInfoKHR.ALPHAMODE, value); }
	/** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
	public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkDisplaySurfaceCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkDisplaySurfaceCreateInfoKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplaySurfaceCreateInfoKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplaySurfaceCreateInfoKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplaySurfaceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplaySurfaceCreateInfoKHR newInstance(long address) {
			return new VkDisplaySurfaceCreateInfoKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDisplaySurfaceCreateInfoKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDisplaySurfaceCreateInfoKHR.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDisplaySurfaceCreateInfoKHR.nflags(address()); }
		/** Returns the value of the {@code displayMode} field. */
		public long displayMode() { return VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address()); }
		/** Returns the value of the {@code planeIndex} field. */
		public int planeIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address()); }
		/** Returns the value of the {@code planeStackIndex} field. */
		public int planeStackIndex() { return VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address()); }
		/** Returns the value of the {@code transform} field. */
		public int transform() { return VkDisplaySurfaceCreateInfoKHR.ntransform(address()); }
		/** Returns the value of the {@code globalAlpha} field. */
		public float globalAlpha() { return VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address()); }
		/** Returns the value of the {@code alphaMode} field. */
		public int alphaMode() { return VkDisplaySurfaceCreateInfoKHR.nalphaMode(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
		public VkExtent2D imageExtent() { return VkDisplaySurfaceCreateInfoKHR.nimageExtent(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer sType(int value) { VkDisplaySurfaceCreateInfoKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer pNext(long value) { VkDisplaySurfaceCreateInfoKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer flags(int value) { VkDisplaySurfaceCreateInfoKHR.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code displayMode} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer displayMode(long value) { VkDisplaySurfaceCreateInfoKHR.ndisplayMode(address(), value); return this; }
		/** Sets the specified value to the {@code planeIndex} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer planeIndex(int value) { VkDisplaySurfaceCreateInfoKHR.nplaneIndex(address(), value); return this; }
		/** Sets the specified value to the {@code planeStackIndex} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer planeStackIndex(int value) { VkDisplaySurfaceCreateInfoKHR.nplaneStackIndex(address(), value); return this; }
		/** Sets the specified value to the {@code transform} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer transform(int value) { VkDisplaySurfaceCreateInfoKHR.ntransform(address(), value); return this; }
		/** Sets the specified value to the {@code globalAlpha} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer globalAlpha(float value) { VkDisplaySurfaceCreateInfoKHR.nglobalAlpha(address(), value); return this; }
		/** Sets the specified value to the {@code alphaMode} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer alphaMode(int value) { VkDisplaySurfaceCreateInfoKHR.nalphaMode(address(), value); return this; }
		/** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
		public VkDisplaySurfaceCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkDisplaySurfaceCreateInfoKHR.nimageExtent(address(), value); return this; }

	}

}