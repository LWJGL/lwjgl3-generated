/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * Mode and mask controlling which physical devices' images are presented.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX}, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding physical device <b>must</b> have a presentation engine as reported by {@link VkDeviceGroupPresentCapabilitiesKHX}.</p>
 * 
 * <p>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX}, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask}.</p>
 * 
 * <p>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX}, then each element of {@code pDeviceMasks} selects which instances of the swapchain image are component-wise summed and the sum of those images is presented. If the sum in any component is outside the representable range, the value of that component is undefined. Each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask}.</p>
 * 
 * <p>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX}, then each element of {@code pDeviceMasks} selects which instance(s) of the swapchain images are presented. For each bit set in each element of {@code pDeviceMasks}, the corresponding physical device <b>must</b> have a presentation engine as reported by {@link VkDeviceGroupPresentCapabilitiesKHX}.</p>
 * 
 * <p>If {@link VkDeviceGroupPresentInfoKHX} is not provided or {@code swapchainCount} is zero then the masks are considered to be 1. If {@link VkDeviceGroupPresentInfoKHX} is not provided, {@code mode} is considered to be {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> equal 0 or {@link VkPresentInfoKHR}{@code ::swapchainCount}</li>
 * <li>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHX}, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding element of {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask} <b>must</b> be non-zero</li>
 * <li>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHX}, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask}.</li>
 * <li>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHX}, then each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask}</li>
 * <li>If {@code mode} is {@link KHXDeviceGroup#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHX}, then for each bit set in each element of {@code pDeviceMasks}, the corresponding element of {@link VkDeviceGroupPresentCapabilitiesKHX}{@code ::presentMask} <b>must</b> be non-zero</li>
 * <li>The value of each element of {@code pDeviceMasks} <b>must</b> be equal to the device mask passed in {@link VkAcquireNextImageInfoKHX}{@code ::deviceMask} when the image index was last acquired</li>
 * <li>{@code mode} <b>must</b> have exactly one bit set, and that bit <b>must</b> have been included in {@link VkDeviceGroupSwapchainCreateInfoKHX}{@code ::modes}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXDeviceGroup#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}, or a pointer to a valid instance of {@link VkDisplayPresentInfoKHR}, or {@link VkPresentTimesInfoGOOGLE}</li>
 * <li>If {@code swapchainCount} is not 0, {@code pDeviceMasks} <b>must</b> be a pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkDeviceGroupPresentModeFlagBitsKHX} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code swapchainCount} &ndash; zero or the number of elements in {@code pDeviceMasks}.</li>
 * <li>{@code pDeviceMasks} &ndash; an array of device masks, one for each element of {@link VkPresentInfoKHR}::pSwapchains.</li>
 * <li>{@code mode} &ndash; the device group present mode that will be used for this present.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDeviceGroupPresentInfoKHX {
    VkStructureType sType;
    const void * pNext;
    uint32_t swapchainCount;
    const uint32_t * pDeviceMasks;
    VkDeviceGroupPresentModeFlagBitsKHX mode;
}</code></pre>
 */
public class VkDeviceGroupPresentInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SWAPCHAINCOUNT,
		PDEVICEMASKS,
		MODE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SWAPCHAINCOUNT = layout.offsetof(2);
		PDEVICEMASKS = layout.offsetof(3);
		MODE = layout.offsetof(4);
	}

	VkDeviceGroupPresentInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDeviceGroupPresentInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDeviceGroupPresentInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code swapchainCount} field. */
	public int swapchainCount() { return nswapchainCount(address()); }
	/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceMasks} field. */
	public IntBuffer pDeviceMasks() { return npDeviceMasks(address()); }
	/** Returns the value of the {@code mode} field. */
	public int mode() { return nmode(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDeviceGroupPresentInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDeviceGroupPresentInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceMasks} field. */
	public VkDeviceGroupPresentInfoKHX pDeviceMasks(IntBuffer value) { npDeviceMasks(address(), value); return this; }
	/** Sets the specified value to the {@code mode} field. */
	public VkDeviceGroupPresentInfoKHX mode(int value) { nmode(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDeviceGroupPresentInfoKHX set(
		int sType,
		long pNext,
		IntBuffer pDeviceMasks,
		int mode
	) {
		sType(sType);
		pNext(pNext);
		pDeviceMasks(pDeviceMasks);
		mode(mode);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkDeviceGroupPresentInfoKHX set(VkDeviceGroupPresentInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDeviceGroupPresentInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDeviceGroupPresentInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkDeviceGroupPresentInfoKHX create() {
		return new VkDeviceGroupPresentInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDeviceGroupPresentInfoKHX create(long address) {
		return address == NULL ? null : new VkDeviceGroupPresentInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDeviceGroupPresentInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDeviceGroupPresentInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDeviceGroupPresentInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDeviceGroupPresentInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDeviceGroupPresentInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentInfoKHX.PNEXT); }
	/** Unsafe version of {@link #swapchainCount}. */
	public static int nswapchainCount(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHX.SWAPCHAINCOUNT); }
	/** Unsafe version of {@link #pDeviceMasks() pDeviceMasks}. */
	public static IntBuffer npDeviceMasks(long struct) { return memIntBuffer(memGetAddress(struct + VkDeviceGroupPresentInfoKHX.PDEVICEMASKS), nswapchainCount(struct)); }
	/** Unsafe version of {@link #mode}. */
	public static int nmode(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHX.MODE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHX.PNEXT, value); }
	/** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
	public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHX.SWAPCHAINCOUNT, value); }
	/** Unsafe version of {@link #pDeviceMasks(IntBuffer) pDeviceMasks}. */
	public static void npDeviceMasks(long struct, IntBuffer value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHX.PDEVICEMASKS, memAddressSafe(value)); nswapchainCount(struct, value == null ? 0 : value.remaining()); }
	/** Unsafe version of {@link #mode(int) mode}. */
	public static void nmode(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHX.MODE, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nswapchainCount(struct) != 0 )
			check(memGetAddress(struct + VkDeviceGroupPresentInfoKHX.PDEVICEMASKS));
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

	/** An array of {@link VkDeviceGroupPresentInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkDeviceGroupPresentInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkDeviceGroupPresentInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDeviceGroupPresentInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkDeviceGroupPresentInfoKHX newInstance(long address) {
			return new VkDeviceGroupPresentInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDeviceGroupPresentInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDeviceGroupPresentInfoKHX.npNext(address()); }
		/** Returns the value of the {@code swapchainCount} field. */
		public int swapchainCount() { return VkDeviceGroupPresentInfoKHX.nswapchainCount(address()); }
		/** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceMasks} field. */
		public IntBuffer pDeviceMasks() { return VkDeviceGroupPresentInfoKHX.npDeviceMasks(address()); }
		/** Returns the value of the {@code mode} field. */
		public int mode() { return VkDeviceGroupPresentInfoKHX.nmode(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDeviceGroupPresentInfoKHX.Buffer sType(int value) { VkDeviceGroupPresentInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDeviceGroupPresentInfoKHX.Buffer pNext(long value) { VkDeviceGroupPresentInfoKHX.npNext(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceMasks} field. */
		public VkDeviceGroupPresentInfoKHX.Buffer pDeviceMasks(IntBuffer value) { VkDeviceGroupPresentInfoKHX.npDeviceMasks(address(), value); return this; }
		/** Sets the specified value to the {@code mode} field. */
		public VkDeviceGroupPresentInfoKHX.Buffer mode(int value) { VkDeviceGroupPresentInfoKHX.nmode(address(), value); return this; }

	}

}