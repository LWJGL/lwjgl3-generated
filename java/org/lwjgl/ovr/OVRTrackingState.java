/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by {@link OVR#ovr_GetTrackingState}.
 * 
 * <h3>ovrTrackingState members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>HeadPose</td><td class="nw">{@link OVRPoseStatef ovrPoseStatef}</td><td>Predicted head pose (and derivatives) at the requested absolute time. The look-ahead interval is equal to
 * {@code (HeadPose.TimeInSeconds - RawSensorData.TimeInSeconds)}.</td></tr>
 * <tr><td>CameraPose</td><td class="nw">{@link OVRPosef ovrPosef}</td><td>Current pose of the external camera (if present). This pose includes camera tilt (roll and pitch). For a leveled coordinate system use
 * {@code LeveledCameraPose}.</td></tr>
 * <tr><td>LeveledCameraPose</td><td class="nw">{@link OVRPosef ovrPosef}</td><td>Camera frame aligned with gravity. This value includes position and yaw of the camera, but not roll and pitch. It can be used as a reference point to
 * render real-world objects in the correct location.</td></tr>
 * <tr><td>HandPoses</td><td class="nw">ovrPoseStatef[2]</td><td>The most recent calculated pose for each hand when hand controller tracking is present. {@code HandPoses[ovrHand_Left]} refers to the left hand and
 * {@code HandPoses[ovrHand_Right]} to the right hand. These values can be combined with {@code ovrInputState} for complete hand controller information.</td></tr>
 * <tr><td>RawSensorData</td><td class="nw">{@link OVRSensorData ovrSensorData}</td><td>the most recent sensor data received from the HMD</td></tr>
 * <tr><td>StatusFlags</td><td class="nw">unsigned int</td><td>tracking status described by {@code ovrStatusBits}</td></tr>
 * <tr><td>HandStatusFlags</td><td class="nw">unsigned int[2]</td><td>hand status flags described by {@code ovrStatusBits}. Only {@link OVR#ovrStatus_OrientationTracked} and {@link OVR#ovrStatus_PositionTracked} are reported.</td></tr>
 * <tr><td>LastCameraFrameCounter</td><td class="nw">uint32_t</td><td>tag the vision processing results to a certain frame counter number</td></tr>
 * </table>
 */
public class OVRTrackingState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		HEADPOSE,
		CAMERAPOSE,
		LEVELEDCAMERAPOSE,
		HANDPOSES,
		RAWSENSORDATA,
		STATUSFLAGS,
		HANDSTATUSFLAGS,
		LASTCAMERAFRAMECOUNTER;

	static {
		Layout layout = __struct(
			__member(OVRPoseStatef.SIZEOF, OVRPoseStatef.__ALIGNMENT),
			__member(OVRPosef.SIZEOF, OVRPosef.__ALIGNMENT),
			__member(OVRPosef.SIZEOF, OVRPosef.__ALIGNMENT),
			__array(OVRPoseStatef.SIZEOF, OVRPoseStatef.__ALIGNMENT, 2),
			__member(OVRSensorData.SIZEOF, OVRSensorData.__ALIGNMENT),
			__member(4),
			__array(4, 2),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		HEADPOSE = layout.offsetof(0);
		CAMERAPOSE = layout.offsetof(1);
		LEVELEDCAMERAPOSE = layout.offsetof(2);
		HANDPOSES = layout.offsetof(3);
		RAWSENSORDATA = layout.offsetof(4);
		STATUSFLAGS = layout.offsetof(5);
		HANDSTATUSFLAGS = layout.offsetof(6);
		LASTCAMERAFRAMECOUNTER = layout.offsetof(7);
	}

	OVRTrackingState(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRTrackingState} instance at the specified memory address. */
	public OVRTrackingState(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRTrackingState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTrackingState(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRPoseStatef} view of the {@code HeadPose} field. */
	public OVRPoseStatef HeadPose() { return nHeadPose(address()); }
	/** Returns a {@link OVRPosef} view of the {@code CameraPose} field. */
	public OVRPosef CameraPose() { return nCameraPose(address()); }
	/** Returns a {@link OVRPosef} view of the {@code LeveledCameraPose} field. */
	public OVRPosef LeveledCameraPose() { return nLeveledCameraPose(address()); }
	/** Returns a {@link OVRPoseStatef}.Buffer view of the {@code HandPoses} field. */
	public OVRPoseStatef.Buffer HandPoses() { return nHandPoses(address()); }
	/** Returns a {@link OVRPoseStatef} view of the struct at the specified index of the {@code HandPoses} field. */
	public OVRPoseStatef HandPoses(int index) { return nHandPoses(address(), index); }
	/** Returns a {@link OVRSensorData} view of the {@code RawSensorData} field. */
	public OVRSensorData RawSensorData() { return nRawSensorData(address()); }
	/** Returns the value of the {@code StatusFlags} field. */
	public int StatusFlags() { return nStatusFlags(address()); }
	/** Returns a {@link IntBuffer} view of the {@code HandStatusFlags} field. */
	public IntBuffer HandStatusFlags() { return nHandStatusFlags(address()); }
	/** Returns the value at the specified index of the {@code HandStatusFlags} field. */
	public int HandStatusFlags(int index) { return nHandStatusFlags(address(), index); }
	/** Returns the value of the {@code LastCameraFrameCounter} field. */
	public int LastCameraFrameCounter() { return nLastCameraFrameCounter(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRTrackingState malloc() {
		return new OVRTrackingState(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRTrackingState calloc() {
		return new OVRTrackingState(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTrackingState} instance allocated with {@link BufferUtils}. */
	public static OVRTrackingState create() {
		return new OVRTrackingState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRTrackingState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #HeadPose}. */
	public static OVRPoseStatef nHeadPose(long struct) { return new OVRPoseStatef(struct + OVRTrackingState.HEADPOSE); }
	/** Unsafe version of {@link #CameraPose}. */
	public static OVRPosef nCameraPose(long struct) { return new OVRPosef(struct + OVRTrackingState.CAMERAPOSE); }
	/** Unsafe version of {@link #LeveledCameraPose}. */
	public static OVRPosef nLeveledCameraPose(long struct) { return new OVRPosef(struct + OVRTrackingState.LEVELEDCAMERAPOSE); }
	/** Unsafe version of {@link #HandPoses}. */
	public static OVRPoseStatef.Buffer nHandPoses(long struct) {
		return OVRPoseStatef.createBuffer(struct + OVRTrackingState.HANDPOSES, 2);
	}
	/** Unsafe version of {@link #HandPoses(int) HandPoses}. */
	public static OVRPoseStatef nHandPoses(long struct, int index) {
		return new OVRPoseStatef(struct + OVRTrackingState.HANDPOSES + index * OVRPoseStatef.SIZEOF);
	}
	/** Unsafe version of {@link #RawSensorData}. */
	public static OVRSensorData nRawSensorData(long struct) { return new OVRSensorData(struct + OVRTrackingState.RAWSENSORDATA); }
	/** Unsafe version of {@link #StatusFlags}. */
	public static int nStatusFlags(long struct) { return memGetInt(struct + OVRTrackingState.STATUSFLAGS); }
	/** Unsafe version of {@link #HandStatusFlags}. */
	public static IntBuffer nHandStatusFlags(long struct) {
		return memIntBuffer(struct + OVRTrackingState.HANDSTATUSFLAGS, 2);
	}
	/** Unsafe version of {@link #HandStatusFlags(int) HandStatusFlags}. */
	public static int nHandStatusFlags(long struct, int index) { return memGetInt(struct + OVRTrackingState.HANDSTATUSFLAGS + index * 4); }
	/** Unsafe version of {@link #LastCameraFrameCounter}. */
	public static int nLastCameraFrameCounter(long struct) { return memGetInt(struct + OVRTrackingState.LASTCAMERAFRAMECOUNTER); }

	// -----------------------------------

	/** An array of {@link OVRTrackingState} structs. */
	public static final class Buffer extends StructBuffer<OVRTrackingState, Buffer> {

		/**
		 * Creates a new {@link OVRTrackingState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTrackingState#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRTrackingState newInstance(long address) {
			return new OVRTrackingState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRPoseStatef} view of the {@code HeadPose} field. */
		public OVRPoseStatef HeadPose() { return nHeadPose(address()); }
		/** Returns a {@link OVRPosef} view of the {@code CameraPose} field. */
		public OVRPosef CameraPose() { return nCameraPose(address()); }
		/** Returns a {@link OVRPosef} view of the {@code LeveledCameraPose} field. */
		public OVRPosef LeveledCameraPose() { return nLeveledCameraPose(address()); }
		/** Returns a {@link OVRPoseStatef}.Buffer view of the {@code HandPoses} field. */
		public OVRPoseStatef.Buffer HandPoses() { return nHandPoses(address()); }
		/** Returns a {@link OVRPoseStatef} view of the struct at the specified index of the {@code HandPoses} field. */
		public OVRPoseStatef HandPoses(int index) { return nHandPoses(address(), index); }
		/** Returns a {@link OVRSensorData} view of the {@code RawSensorData} field. */
		public OVRSensorData RawSensorData() { return nRawSensorData(address()); }
		/** Returns the value of the {@code StatusFlags} field. */
		public int StatusFlags() { return nStatusFlags(address()); }
		/** Returns a {@link IntBuffer} view of the {@code HandStatusFlags} field. */
		public IntBuffer HandStatusFlags() { return nHandStatusFlags(address()); }
		/** Returns the value at the specified index of the {@code HandStatusFlags} field. */
		public int HandStatusFlags(int index) { return nHandStatusFlags(address(), index); }
		/** Returns the value of the {@code LastCameraFrameCounter} field. */
		public int LastCameraFrameCounter() { return nLastCameraFrameCounter(address()); }

	}

}