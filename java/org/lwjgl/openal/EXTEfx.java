/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.APIUtil.*;

/** bindings to ALC_EXT_EFX extension. */
public final class EXTEfx {

	/** ALC tokens. */
	public static final int
		ALC_EFX_MAJOR_VERSION   = 0x20001,
		ALC_EFX_MINOR_VERSION   = 0x20002,
		ALC_MAX_AUXILIARY_SENDS = 0x20003;

	/** Listener properties. */
	public static final int
		AL_METERS_PER_UNIT  = 0x20004;

	/** Source properties. */
	public static final int
		AL_DIRECT_FILTER                     = 0x20005,
		AL_AUXILIARY_SEND_FILTER             = 0x20006,
		AL_AIR_ABSORPTION_FACTOR             = 0x20007,
		AL_ROOM_ROLLOFF_FACTOR               = 0x20008,
		AL_CONE_OUTER_GAINHF                 = 0x20009,
		AL_DIRECT_FILTER_GAINHF_AUTO         = 0x2000A,
		AL_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x2000B,
		AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x2000C;

	/** Auxiliary effect slot properties. */
	public static final int
		AL_EFFECTSLOT_NULL                = 0x0,
		AL_EFFECTSLOT_EFFECT              = 0x1,
		AL_EFFECTSLOT_GAIN                = 0x2,
		AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 0x3;

	/** Reverb effect parameters. */
	public static final int
		AL_REVERB_DENSITY               = 0x1,
		AL_REVERB_DIFFUSION             = 0x2,
		AL_REVERB_GAIN                  = 0x3,
		AL_REVERB_GAINHF                = 0x4,
		AL_REVERB_DECAY_TIME            = 0x5,
		AL_REVERB_DECAY_HFRATIO         = 0x6,
		AL_REVERB_REFLECTIONS_GAIN      = 0x7,
		AL_REVERB_REFLECTIONS_DELAY     = 0x8,
		AL_REVERB_LATE_REVERB_GAIN      = 0x9,
		AL_REVERB_LATE_REVERB_DELAY     = 0xA,
		AL_REVERB_AIR_ABSORPTION_GAINHF = 0xB,
		AL_REVERB_ROOM_ROLLOFF_FACTOR   = 0xC,
		AL_REVERB_DECAY_HFLIMIT         = 0xD;

	/** EAX Reverb effect parameters. */
	public static final int
		AL_EAXREVERB_DENSITY               = 0x1,
		AL_EAXREVERB_DIFFUSION             = 0x2,
		AL_EAXREVERB_GAIN                  = 0x3,
		AL_EAXREVERB_GAINHF                = 0x4,
		AL_EAXREVERB_GAINLF                = 0x5,
		AL_EAXREVERB_DECAY_TIME            = 0x6,
		AL_EAXREVERB_DECAY_HFRATIO         = 0x7,
		AL_EAXREVERB_DECAY_LFRATIO         = 0x8,
		AL_EAXREVERB_REFLECTIONS_GAIN      = 0x9,
		AL_EAXREVERB_REFLECTIONS_DELAY     = 0xA,
		AL_EAXREVERB_REFLECTIONS_PAN       = 0xB,
		AL_EAXREVERB_LATE_REVERB_GAIN      = 0xC,
		AL_EAXREVERB_LATE_REVERB_DELAY     = 0xD,
		AL_EAXREVERB_LATE_REVERB_PAN       = 0xE,
		AL_EAXREVERB_ECHO_TIME             = 0xF,
		AL_EAXREVERB_ECHO_DEPTH            = 0x10,
		AL_EAXREVERB_MODULATION_TIME       = 0x11,
		AL_EAXREVERB_MODULATION_DEPTH      = 0x12,
		AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 0x13,
		AL_EAXREVERB_HFREFERENCE           = 0x14,
		AL_EAXREVERB_LFREFERENCE           = 0x15,
		AL_EAXREVERB_ROOM_ROLLOFF_FACTOR   = 0x16,
		AL_EAXREVERB_DECAY_HFLIMIT         = 0x17;

	/** Chorus effect parameters. */
	public static final int
		AL_CHORUS_WAVEFORM = 0x1,
		AL_CHORUS_PHASE    = 0x2,
		AL_CHORUS_RATE     = 0x3,
		AL_CHORUS_DEPTH    = 0x4,
		AL_CHORUS_FEEDBACK = 0x5,
		AL_CHORUS_DELAY    = 0x6;

	/** Distortion effect parameters. */
	public static final int
		AL_DISTORTION_EDGE           = 0x1,
		AL_DISTORTION_GAIN           = 0x2,
		AL_DISTORTION_LOWPASS_CUTOFF = 0x3,
		AL_DISTORTION_EQCENTER       = 0x4,
		AL_DISTORTION_EQBANDWIDTH    = 0x5;

	/** Echo effect parameters. */
	public static final int
		AL_ECHO_DELAY    = 0x1,
		AL_ECHO_LRDELAY  = 0x2,
		AL_ECHO_DAMPING  = 0x3,
		AL_ECHO_FEEDBACK = 0x4,
		AL_ECHO_SPREAD   = 0x5;

	/** Flanger effect parameters. */
	public static final int
		AL_FLANGER_WAVEFORM = 0x1,
		AL_FLANGER_PHASE    = 0x2,
		AL_FLANGER_RATE     = 0x3,
		AL_FLANGER_DEPTH    = 0x4,
		AL_FLANGER_FEEDBACK = 0x5,
		AL_FLANGER_DELAY    = 0x6;

	/** Frequency shifter effect parameters. */
	public static final int
		AL_FREQUENCY_SHIFTER_FREQUENCY       = 0x1,
		AL_FREQUENCY_SHIFTER_LEFT_DIRECTION  = 0x2,
		AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 0x3;

	/** Vocal morpher effect parameters. */
	public static final int
		AL_VOCMORPHER_PHONEMEA               = 0x1,
		AL_VOCMORPHER_PHONEMEA_COARSE_TUNING = 0x2,
		AL_VOCMORPHER_PHONEMEB               = 0x3,
		AL_VOCMORPHER_PHONEMEB_COARSE_TUNING = 0x4,
		AL_VOCMORPHER_WAVEFORM               = 0x5,
		AL_VOCMORPHER_RATE                   = 0x6;

	/** Pitch shifter effect parameters. */
	public static final int
		AL_PITCH_SHIFTER_COARSE_TUNE = 0x1,
		AL_PITCH_SHIFTER_FINE_TUNE   = 0x2;

	/** Ring modulator effect parameters. */
	public static final int
		AL_RING_MODULATOR_FREQUENCY       = 0x1,
		AL_RING_MODULATOR_HIGHPASS_CUTOFF = 0x2,
		AL_RING_MODULATOR_WAVEFORM        = 0x3;

	/** Autowah effect parameters. */
	public static final int
		AL_AUTOWAH_ATTACK_TIME  = 0x1,
		AL_AUTOWAH_RELEASE_TIME = 0x2,
		AL_AUTOWAH_RESONANCE    = 0x3,
		AL_AUTOWAH_PEAK_GAIN    = 0x4;

	/** Compressor effect parameters. */
	public static final int
		AL_COMPRESSOR_ONOFF = 0x1;

	/** Equalizer effect parameters. */
	public static final int
		AL_EQUALIZER_LOW_GAIN    = 0x1,
		AL_EQUALIZER_LOW_CUTOFF  = 0x2,
		AL_EQUALIZER_MID1_GAIN   = 0x3,
		AL_EQUALIZER_MID1_CENTER = 0x4,
		AL_EQUALIZER_MID1_WIDTH  = 0x5,
		AL_EQUALIZER_MID2_GAIN   = 0x6,
		AL_EQUALIZER_MID2_CENTER = 0x7,
		AL_EQUALIZER_MID2_WIDTH  = 0x8,
		AL_EQUALIZER_HIGH_GAIN   = 0x9,
		AL_EQUALIZER_HIGH_CUTOFF = 0xA;

	/** Effect type effect parameters. */
	public static final int
		AL_EFFECT_FIRST_PARAMETER = 0x0,
		AL_EFFECT_LAST_PARAMETER  = 0x8000,
		AL_EFFECT_TYPE            = 0x8001;

	/** Effect types */
	public static final int
		AL_EFFECT_NULL              = 0x0,
		AL_EFFECT_REVERB            = 0x1,
		AL_EFFECT_CHORUS            = 0x2,
		AL_EFFECT_DISTORTION        = 0x3,
		AL_EFFECT_ECHO              = 0x4,
		AL_EFFECT_FLANGER           = 0x5,
		AL_EFFECT_FREQUENCY_SHIFTER = 0x6,
		AL_EFFECT_VOCAL_MORPHER     = 0x7,
		AL_EFFECT_PITCH_SHIFTER     = 0x8,
		AL_EFFECT_RING_MODULATOR    = 0x9,
		AL_EFFECT_AUTOWAH           = 0xA,
		AL_EFFECT_COMPRESSOR        = 0xB,
		AL_EFFECT_EQUALIZER         = 0xC,
		AL_EFFECT_EAXREVERB         = 0x8000;

	/** Lowpass filter properties */
	public static final int
		AL_LOWPASS_GAIN   = 0x1,
		AL_LOWPASS_GAINHF = 0x2;

	/** Highpass filter properties */
	public static final int
		AL_HIGHPASS_GAIN   = 0x1,
		AL_HIGHPASS_GAINLF = 0x2;

	/** Bandpass filter properties */
	public static final int
		AL_BANDPASS_GAIN   = 0x1,
		AL_BANDPASS_GAINLF = 0x2,
		AL_BANDPASS_GAINHF = 0x3;

	/** Filter type */
	public static final int
		AL_FILTER_FIRST_PARAMETER = 0x0,
		AL_FILTER_LAST_PARAMETER  = 0x8000,
		AL_FILTER_TYPE            = 0x8001;

	/** Filter types. */
	public static final int
		AL_FILTER_NULL     = 0x0,
		AL_FILTER_LOWPASS  = 0x1,
		AL_FILTER_HIGHPASS = 0x2,
		AL_FILTER_BANDPASS = 0x3;

	/** Source property value ranges and defaults */
	public static final float
		AL_MIN_AIR_ABSORPTION_FACTOR     = 0.0f,
		AL_MAX_AIR_ABSORPTION_FACTOR     = 10.0f,
		AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f,
		AL_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f,
		AL_MIN_CONE_OUTER_GAINHF         = 0.0f,
		AL_MAX_CONE_OUTER_GAINHF         = 1.0f,
		AL_DEFAULT_CONE_OUTER_GAINHF     = 1.0f;

	/** Source property value ranges and defaults */
	public static final int
		AL_MIN_DIRECT_FILTER_GAINHF_AUTO             = 0x0,
		AL_MAX_DIRECT_FILTER_GAINHF_AUTO             = 0x1,
		AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO         = 0x1,
		AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x0,
		AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO       = 0x1,
		AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO   = 0x1,
		AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x0,
		AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO     = 0x1,
		AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x1;

	/** Listener property value ranges and defaults. */
	public static final float
		AL_MIN_METERS_PER_UNIT     = 0x0.000002P-126f,
		AL_MAX_METERS_PER_UNIT     = 0x1.fffffeP+127f,
		AL_DEFAULT_METERS_PER_UNIT = 1.0f;

	/** Reverb effect parameter ranges and defaults */
	public static final float
		AL_REVERB_MIN_DENSITY                   = 0.0f,
		AL_REVERB_MAX_DENSITY                   = 1.0f,
		AL_REVERB_DEFAULT_DENSITY               = 1.0f,
		AL_REVERB_MIN_DIFFUSION                 = 0.0f,
		AL_REVERB_MAX_DIFFUSION                 = 1.0f,
		AL_REVERB_DEFAULT_DIFFUSION             = 1.0f,
		AL_REVERB_MIN_GAIN                      = 0.0f,
		AL_REVERB_MAX_GAIN                      = 1.0f,
		AL_REVERB_DEFAULT_GAIN                  = 0.32f,
		AL_REVERB_MIN_GAINHF                    = 0.0f,
		AL_REVERB_MAX_GAINHF                    = 1.0f,
		AL_REVERB_DEFAULT_GAINHF                = 0.89f,
		AL_REVERB_MIN_DECAY_TIME                = 0.1f,
		AL_REVERB_MAX_DECAY_TIME                = 20.0f,
		AL_REVERB_DEFAULT_DECAY_TIME            = 1.49f,
		AL_REVERB_MIN_DECAY_HFRATIO             = 0.1f,
		AL_REVERB_MAX_DECAY_HFRATIO             = 2.0f,
		AL_REVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
		AL_REVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
		AL_REVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
		AL_REVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
		AL_REVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
		AL_REVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
		AL_REVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
		AL_REVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
		AL_REVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
		AL_REVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
		AL_REVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
		AL_REVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
		AL_REVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
		AL_REVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
		AL_REVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
		AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
		AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

	/** Reverb effect parameter ranges and defaults */
	public static final int
		AL_REVERB_MIN_DECAY_HFLIMIT     = 0x0,
		AL_REVERB_MAX_DECAY_HFLIMIT     = 0x1,
		AL_REVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

	/** EAX reverb effect parameter ranges and defaults */
	public static final float
		AL_EAXREVERB_MIN_DENSITY                   = 0.0f,
		AL_EAXREVERB_MAX_DENSITY                   = 1.0f,
		AL_EAXREVERB_DEFAULT_DENSITY               = 1.0f,
		AL_EAXREVERB_MIN_DIFFUSION                 = 0.0f,
		AL_EAXREVERB_MAX_DIFFUSION                 = 1.0f,
		AL_EAXREVERB_DEFAULT_DIFFUSION             = 1.0f,
		AL_EAXREVERB_MIN_GAIN                      = 0.0f,
		AL_EAXREVERB_MAX_GAIN                      = 1.0f,
		AL_EAXREVERB_DEFAULT_GAIN                  = 0.32f,
		AL_EAXREVERB_MIN_GAINHF                    = 0.0f,
		AL_EAXREVERB_MAX_GAINHF                    = 1.0f,
		AL_EAXREVERB_DEFAULT_GAINHF                = 0.89f,
		AL_EAXREVERB_MIN_GAINLF                    = 0.0f,
		AL_EAXREVERB_MAX_GAINLF                    = 1.0f,
		AL_EAXREVERB_DEFAULT_GAINLF                = 1.0f,
		AL_EAXREVERB_MIN_DECAY_TIME                = 0.1f,
		AL_EAXREVERB_MAX_DECAY_TIME                = 20.0f,
		AL_EAXREVERB_DEFAULT_DECAY_TIME            = 1.49f,
		AL_EAXREVERB_MIN_DECAY_HFRATIO             = 0.1f,
		AL_EAXREVERB_MAX_DECAY_HFRATIO             = 2.0f,
		AL_EAXREVERB_DEFAULT_DECAY_HFRATIO         = 0.83f,
		AL_EAXREVERB_MIN_DECAY_LFRATIO             = 0.1f,
		AL_EAXREVERB_MAX_DECAY_LFRATIO             = 2.0f,
		AL_EAXREVERB_DEFAULT_DECAY_LFRATIO         = 1.0f,
		AL_EAXREVERB_MIN_REFLECTIONS_GAIN          = 0.0f,
		AL_EAXREVERB_MAX_REFLECTIONS_GAIN          = 3.16f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN      = 0.05f,
		AL_EAXREVERB_MIN_REFLECTIONS_DELAY         = 0.0f,
		AL_EAXREVERB_MAX_REFLECTIONS_DELAY         = 0.3f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY     = 0.007f,
		AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ   = 0.0f,
		AL_EAXREVERB_MIN_LATE_REVERB_GAIN          = 0.0f,
		AL_EAXREVERB_MAX_LATE_REVERB_GAIN          = 10.0f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN      = 1.26f,
		AL_EAXREVERB_MIN_LATE_REVERB_DELAY         = 0.0f,
		AL_EAXREVERB_MAX_LATE_REVERB_DELAY         = 0.1f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY     = 0.011f,
		AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ   = 0.0f,
		AL_EAXREVERB_MIN_ECHO_TIME                 = 0.075f,
		AL_EAXREVERB_MAX_ECHO_TIME                 = 0.25f,
		AL_EAXREVERB_DEFAULT_ECHO_TIME             = 0.25f,
		AL_EAXREVERB_MIN_ECHO_DEPTH                = 0.0f,
		AL_EAXREVERB_MAX_ECHO_DEPTH                = 1.0f,
		AL_EAXREVERB_DEFAULT_ECHO_DEPTH            = 0.0f,
		AL_EAXREVERB_MIN_MODULATION_TIME           = 0.04f,
		AL_EAXREVERB_MAX_MODULATION_TIME           = 4.0f,
		AL_EAXREVERB_DEFAULT_MODULATION_TIME       = 0.25f,
		AL_EAXREVERB_MIN_MODULATION_DEPTH          = 0.0f,
		AL_EAXREVERB_MAX_MODULATION_DEPTH          = 1.0f,
		AL_EAXREVERB_DEFAULT_MODULATION_DEPTH      = 0.0f,
		AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF     = 0.892f,
		AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF     = 1.0f,
		AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f,
		AL_EAXREVERB_MIN_HFREFERENCE               = 1000.0f,
		AL_EAXREVERB_MAX_HFREFERENCE               = 20000.0f,
		AL_EAXREVERB_DEFAULT_HFREFERENCE           = 5000.0f,
		AL_EAXREVERB_MIN_LFREFERENCE               = 20.0f,
		AL_EAXREVERB_MAX_LFREFERENCE               = 1000.0f,
		AL_EAXREVERB_DEFAULT_LFREFERENCE           = 250.0f,
		AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR       = 0.0f,
		AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR       = 10.0f,
		AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR   = 0.0f;

	/** EAX reverb effect parameter ranges and defaults */
	public static final int
		AL_EAXREVERB_MIN_DECAY_HFLIMIT     = 0x0,
		AL_EAXREVERB_MAX_DECAY_HFLIMIT     = 0x1,
		AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 0x1;

	/** Chorus effect parameter ranges and defaults */
	public static final int
		AL_CHORUS_WAVEFORM_SINUSOID = 0x0,
		AL_CHORUS_WAVEFORM_TRIANGLE = 0x1,
		AL_CHORUS_MIN_WAVEFORM      = 0x0,
		AL_CHORUS_MAX_WAVEFORM      = 0x1,
		AL_CHORUS_DEFAULT_WAVEFORM  = 0x1,
		AL_CHORUS_MIN_PHASE         = 0xFFFFFF4C,
		AL_CHORUS_MAX_PHASE         = 0xB4,
		AL_CHORUS_DEFAULT_PHASE     = 0x5A;

	/** Chorus effect parameter ranges and defaults */
	public static final float
		AL_CHORUS_MIN_RATE         = 0.0f,
		AL_CHORUS_MAX_RATE         = 10.0f,
		AL_CHORUS_DEFAULT_RATE     = 1.1f,
		AL_CHORUS_MIN_DEPTH        = 0.0f,
		AL_CHORUS_MAX_DEPTH        = 1.0f,
		AL_CHORUS_DEFAULT_DEPTH    = 0.1f,
		AL_CHORUS_MIN_FEEDBACK     = -1.0f,
		AL_CHORUS_MAX_FEEDBACK     = 1.0f,
		AL_CHORUS_DEFAULT_FEEDBACK = 0.25f,
		AL_CHORUS_MIN_DELAY        = 0.0f,
		AL_CHORUS_MAX_DELAY        = 0.016f,
		AL_CHORUS_DEFAULT_DELAY    = 0.016f;

	/** Distortion effect parameter ranges and defaults */
	public static final float
		AL_DISTORTION_MIN_EDGE               = 0.0f,
		AL_DISTORTION_MAX_EDGE               = 1.0f,
		AL_DISTORTION_DEFAULT_EDGE           = 0.2f,
		AL_DISTORTION_MIN_GAIN               = 0.01f,
		AL_DISTORTION_MAX_GAIN               = 1.0f,
		AL_DISTORTION_DEFAULT_GAIN           = 0.05f,
		AL_DISTORTION_MIN_LOWPASS_CUTOFF     = 80.0f,
		AL_DISTORTION_MAX_LOWPASS_CUTOFF     = 24000.0f,
		AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f,
		AL_DISTORTION_MIN_EQCENTER           = 80.0f,
		AL_DISTORTION_MAX_EQCENTER           = 24000.0f,
		AL_DISTORTION_DEFAULT_EQCENTER       = 3600.0f,
		AL_DISTORTION_MIN_EQBANDWIDTH        = 80.0f,
		AL_DISTORTION_MAX_EQBANDWIDTH        = 24000.0f,
		AL_DISTORTION_DEFAULT_EQBANDWIDTH    = 3600.0f;

	/** Echo effect parameter ranges and defaults */
	public static final float
		AL_ECHO_MIN_DELAY        = 0.0f,
		AL_ECHO_MAX_DELAY        = 0.207f,
		AL_ECHO_DEFAULT_DELAY    = 0.1f,
		AL_ECHO_MIN_LRDELAY      = 0.0f,
		AL_ECHO_MAX_LRDELAY      = 0.404f,
		AL_ECHO_DEFAULT_LRDELAY  = 0.1f,
		AL_ECHO_MIN_DAMPING      = 0.0f,
		AL_ECHO_MAX_DAMPING      = 0.99f,
		AL_ECHO_DEFAULT_DAMPING  = 0.5f,
		AL_ECHO_MIN_FEEDBACK     = 0.0f,
		AL_ECHO_MAX_FEEDBACK     = 1.0f,
		AL_ECHO_DEFAULT_FEEDBACK = 0.5f,
		AL_ECHO_MIN_SPREAD       = -1.0f,
		AL_ECHO_MAX_SPREAD       = 1.0f,
		AL_ECHO_DEFAULT_SPREAD   = -1.0f;

	/** Flanger effect parameter ranges and defaults */
	public static final int
		AL_FLANGER_WAVEFORM_SINUSOID = 0x0,
		AL_FLANGER_WAVEFORM_TRIANGLE = 0x1,
		AL_FLANGER_MIN_WAVEFORM      = 0x0,
		AL_FLANGER_MAX_WAVEFORM      = 0x1,
		AL_FLANGER_DEFAULT_WAVEFORM  = 0x1,
		AL_FLANGER_MIN_PHASE         = 0xFFFFFF4C,
		AL_FLANGER_MAX_PHASE         = 0xB4,
		AL_FLANGER_DEFAULT_PHASE     = 0x0;

	/** Flanger effect parameter ranges and defaults */
	public static final float
		AL_FLANGER_MIN_RATE         = 0.0f,
		AL_FLANGER_MAX_RATE         = 10.0f,
		AL_FLANGER_DEFAULT_RATE     = 0.27f,
		AL_FLANGER_MIN_DEPTH        = 0.0f,
		AL_FLANGER_MAX_DEPTH        = 1.0f,
		AL_FLANGER_DEFAULT_DEPTH    = 1.0f,
		AL_FLANGER_MIN_FEEDBACK     = -1.0f,
		AL_FLANGER_MAX_FEEDBACK     = 1.0f,
		AL_FLANGER_DEFAULT_FEEDBACK = -0.5f,
		AL_FLANGER_MIN_DELAY        = 0.0f,
		AL_FLANGER_MAX_DELAY        = 0.004f,
		AL_FLANGER_DEFAULT_DELAY    = 0.002f;

	/** Frequency shifter effect parameter ranges and defaults */
	public static final float
		AL_FREQUENCY_SHIFTER_MIN_FREQUENCY     = 0.0f,
		AL_FREQUENCY_SHIFTER_MAX_FREQUENCY     = 24000.0f,
		AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;

	/** Frequency shifter effect parameter ranges and defaults */
	public static final int
		AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION      = 0x0,
		AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION      = 0x2,
		AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION  = 0x0,
		AL_FREQUENCY_SHIFTER_DIRECTION_DOWN          = 0x0,
		AL_FREQUENCY_SHIFTER_DIRECTION_UP            = 0x1,
		AL_FREQUENCY_SHIFTER_DIRECTION_OFF           = 0x2,
		AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION     = 0x0,
		AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION     = 0x2,
		AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0x0;

	/** Vocal morpher effect parameter ranges and defaults */
	public static final int
		AL_VOCAL_MORPHER_MIN_PHONEMEA                   = 0x0,
		AL_VOCAL_MORPHER_MAX_PHONEMEA                   = 0x1D,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEA               = 0x0,
		AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING     = 0xFFFFFFE8,
		AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING     = 0x18,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0x0,
		AL_VOCAL_MORPHER_MIN_PHONEMEB                   = 0x0,
		AL_VOCAL_MORPHER_MAX_PHONEMEB                   = 0x1D,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEB               = 0xA,
		AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING     = 0xFFFFFFE8,
		AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING     = 0x18,
		AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0x0,
		AL_VOCAL_MORPHER_PHONEME_A                      = 0x0,
		AL_VOCAL_MORPHER_PHONEME_E                      = 0x1,
		AL_VOCAL_MORPHER_PHONEME_I                      = 0x2,
		AL_VOCAL_MORPHER_PHONEME_O                      = 0x3,
		AL_VOCAL_MORPHER_PHONEME_U                      = 0x4,
		AL_VOCAL_MORPHER_PHONEME_AA                     = 0x5,
		AL_VOCAL_MORPHER_PHONEME_AE                     = 0x6,
		AL_VOCAL_MORPHER_PHONEME_AH                     = 0x7,
		AL_VOCAL_MORPHER_PHONEME_AO                     = 0x8,
		AL_VOCAL_MORPHER_PHONEME_EH                     = 0x9,
		AL_VOCAL_MORPHER_PHONEME_ER                     = 0xA,
		AL_VOCAL_MORPHER_PHONEME_IH                     = 0xB,
		AL_VOCAL_MORPHER_PHONEME_IY                     = 0xC,
		AL_VOCAL_MORPHER_PHONEME_UH                     = 0xD,
		AL_VOCAL_MORPHER_PHONEME_UW                     = 0xE,
		AL_VOCAL_MORPHER_PHONEME_B                      = 0xF,
		AL_VOCAL_MORPHER_PHONEME_D                      = 0x10,
		AL_VOCAL_MORPHER_PHONEME_F                      = 0x11,
		AL_VOCAL_MORPHER_PHONEME_G                      = 0x12,
		AL_VOCAL_MORPHER_PHONEME_J                      = 0x13,
		AL_VOCAL_MORPHER_PHONEME_K                      = 0x14,
		AL_VOCAL_MORPHER_PHONEME_L                      = 0x15,
		AL_VOCAL_MORPHER_PHONEME_M                      = 0x16,
		AL_VOCAL_MORPHER_PHONEME_N                      = 0x17,
		AL_VOCAL_MORPHER_PHONEME_P                      = 0x18,
		AL_VOCAL_MORPHER_PHONEME_R                      = 0x19,
		AL_VOCAL_MORPHER_PHONEME_S                      = 0x1A,
		AL_VOCAL_MORPHER_PHONEME_T                      = 0x1B,
		AL_VOCAL_MORPHER_PHONEME_V                      = 0x1C,
		AL_VOCAL_MORPHER_PHONEME_Z                      = 0x1D,
		AL_VOCAL_MORPHER_WAVEFORM_SINUSOID              = 0x0,
		AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE              = 0x1,
		AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH              = 0x2,
		AL_VOCAL_MORPHER_MIN_WAVEFORM                   = 0x0,
		AL_VOCAL_MORPHER_MAX_WAVEFORM                   = 0x2,
		AL_VOCAL_MORPHER_DEFAULT_WAVEFORM               = 0x0;

	/** Vocal morpher effect parameter ranges and defaults */
	public static final float
		AL_VOCAL_MORPHER_MIN_RATE     = 0.0f,
		AL_VOCAL_MORPHER_MAX_RATE     = 10.0f,
		AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;

	/** Pitch shifter effect parameter ranges and defaults */
	public static final int
		AL_PITCH_SHIFTER_MIN_COARSE_TUNE     = 0xFFFFFFF4,
		AL_PITCH_SHIFTER_MAX_COARSE_TUNE     = 0xC,
		AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 0xC,
		AL_PITCH_SHIFTER_MIN_FINE_TUNE       = 0xFFFFFFCE,
		AL_PITCH_SHIFTER_MAX_FINE_TUNE       = 0x32,
		AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE   = 0x0;

	/** Ring modulator effect parameter ranges and defaults */
	public static final float
		AL_RING_MODULATOR_MIN_FREQUENCY           = 0.0f,
		AL_RING_MODULATOR_MAX_FREQUENCY           = 8000.0f,
		AL_RING_MODULATOR_DEFAULT_FREQUENCY       = 440.0f,
		AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF     = 0.0f,
		AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF     = 24000.0f,
		AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;

	/** Ring modulator effect parameter ranges and defaults */
	public static final int
		AL_RING_MODULATOR_SINUSOID         = 0x0,
		AL_RING_MODULATOR_SAWTOOTH         = 0x1,
		AL_RING_MODULATOR_SQUARE           = 0x2,
		AL_RING_MODULATOR_MIN_WAVEFORM     = 0x0,
		AL_RING_MODULATOR_MAX_WAVEFORM     = 0x2,
		AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0x0;

	/** Autowah effect parameter ranges and defaults */
	public static final float
		AL_AUTOWAH_MIN_ATTACK_TIME      = 1.0E-4f,
		AL_AUTOWAH_MAX_ATTACK_TIME      = 1.0f,
		AL_AUTOWAH_DEFAULT_ATTACK_TIME  = 0.06f,
		AL_AUTOWAH_MIN_RELEASE_TIME     = 1.0E-4f,
		AL_AUTOWAH_MAX_RELEASE_TIME     = 1.0f,
		AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f,
		AL_AUTOWAH_MIN_RESONANCE        = 2.0f,
		AL_AUTOWAH_MAX_RESONANCE        = 1000.0f,
		AL_AUTOWAH_DEFAULT_RESONANCE    = 1000.0f,
		AL_AUTOWAH_MIN_PEAK_GAIN        = 3.0E-5f,
		AL_AUTOWAH_MAX_PEAK_GAIN        = 31621.0f,
		AL_AUTOWAH_DEFAULT_PEAK_GAIN    = 11.22f;

	/** Compressor effect parameter ranges and defaults */
	public static final int
		AL_COMPRESSOR_MIN_ONOFF     = 0x0,
		AL_COMPRESSOR_MAX_ONOFF     = 0x1,
		AL_COMPRESSOR_DEFAULT_ONOFF = 0x1;

	/** Equalizer effect parameter ranges and defaults */
	public static final float
		AL_EQUALIZER_MIN_LOW_GAIN        = 0.126f,
		AL_EQUALIZER_MAX_LOW_GAIN        = 7.943f,
		AL_EQUALIZER_DEFAULT_LOW_GAIN    = 1.0f,
		AL_EQUALIZER_MIN_LOW_CUTOFF      = 50.0f,
		AL_EQUALIZER_MAX_LOW_CUTOFF      = 800.0f,
		AL_EQUALIZER_DEFAULT_LOW_CUTOFF  = 200.0f,
		AL_EQUALIZER_MIN_MID1_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_MID1_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_MID1_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_MID1_CENTER     = 200.0f,
		AL_EQUALIZER_MAX_MID1_CENTER     = 3000.0f,
		AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f,
		AL_EQUALIZER_MIN_MID1_WIDTH      = 0.01f,
		AL_EQUALIZER_MAX_MID1_WIDTH      = 1.0f,
		AL_EQUALIZER_DEFAULT_MID1_WIDTH  = 1.0f,
		AL_EQUALIZER_MIN_MID2_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_MID2_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_MID2_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_MID2_CENTER     = 1000.0f,
		AL_EQUALIZER_MAX_MID2_CENTER     = 8000.0f,
		AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f,
		AL_EQUALIZER_MIN_MID2_WIDTH      = 0.01f,
		AL_EQUALIZER_MAX_MID2_WIDTH      = 1.0f,
		AL_EQUALIZER_DEFAULT_MID2_WIDTH  = 1.0f,
		AL_EQUALIZER_MIN_HIGH_GAIN       = 0.126f,
		AL_EQUALIZER_MAX_HIGH_GAIN       = 7.943f,
		AL_EQUALIZER_DEFAULT_HIGH_GAIN   = 1.0f,
		AL_EQUALIZER_MIN_HIGH_CUTOFF     = 4000.0f,
		AL_EQUALIZER_MAX_HIGH_CUTOFF     = 16000.0f,
		AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;

	/** Lowpass filter parameter ranges and defaults */
	public static final float
		AL_LOWPASS_MIN_GAIN       = 0.0f,
		AL_LOWPASS_MAX_GAIN       = 1.0f,
		AL_LOWPASS_DEFAULT_GAIN   = 1.0f,
		AL_LOWPASS_MIN_GAINHF     = 0.0f,
		AL_LOWPASS_MAX_GAINHF     = 1.0f,
		AL_LOWPASS_DEFAULT_GAINHF = 1.0f;

	/** Highpass filter parameter ranges and defaults */
	public static final float
		AL_HIGHPASS_MIN_GAIN       = 0.0f,
		AL_HIGHPASS_MAX_GAIN       = 1.0f,
		AL_HIGHPASS_DEFAULT_GAIN   = 1.0f,
		AL_HIGHPASS_MIN_GAINLF     = 0.0f,
		AL_HIGHPASS_MAX_GAINLF     = 1.0f,
		AL_HIGHPASS_DEFAULT_GAINLF = 1.0f;

	/** Bandpass filter parameter ranges and defaults */
	public static final float
		AL_BANDPASS_MIN_GAIN       = 0.0f,
		AL_BANDPASS_MAX_GAIN       = 1.0f,
		AL_BANDPASS_DEFAULT_GAIN   = 1.0f,
		AL_BANDPASS_MIN_GAINHF     = 0.0f,
		AL_BANDPASS_MAX_GAINHF     = 1.0f,
		AL_BANDPASS_DEFAULT_GAINHF = 1.0f,
		AL_BANDPASS_MIN_GAINLF     = 0.0f,
		AL_BANDPASS_MAX_GAINLF     = 1.0f,
		AL_BANDPASS_DEFAULT_GAINLF = 1.0f;

	private EXTEfx() {}

	// --- [ alGenEffects ] ---

	/** JNI method for {@link #alGenEffects alGenEffects} */
	public static native void nalGenEffects(int n, long effects, long __functionAddress);

	/**
	 * Requests a number of effects.
	 *
	 * @param n       the number of effects be to generated
	 * @param effects the buffer that will receive the effects
	 */
	public static void alGenEffects(int n, ByteBuffer effects) {
		long __functionAddress = getInstance().alGenEffects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(effects, n << 2);
		}
		nalGenEffects(n, memAddress(effects), __functionAddress);
	}

	/** Alternative version of: {@link #alGenEffects alGenEffects} */
	public static void alGenEffects(IntBuffer effects) {
		long __functionAddress = getInstance().alGenEffects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGenEffects(effects.remaining(), memAddress(effects), __functionAddress);
	}

	/** Single return value version of: {@link #alGenEffects alGenEffects} */
	public static int alGenEffects() {
		long __functionAddress = getInstance().alGenEffects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int effects = __buffer.intParam();
		nalGenEffects(1, __buffer.address() + effects, __functionAddress);
		return __buffer.intValue(effects);
	}

	// --- [ alDeleteEffects ] ---

	/** JNI method for {@link #alDeleteEffects alDeleteEffects} */
	public static native void nalDeleteEffects(int n, long effects, long __functionAddress);

	/**
	 * Deletes a number of effects.
	 *
	 * @param n       the number of effects be to deleted
	 * @param effects the effect to delete
	 */
	public static void alDeleteEffects(int n, ByteBuffer effects) {
		long __functionAddress = getInstance().alDeleteEffects;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(effects, n << 2);
		}
		nalDeleteEffects(n, memAddress(effects), __functionAddress);
	}

	/** Alternative version of: {@link #alDeleteEffects alDeleteEffects} */
	public static void alDeleteEffects(IntBuffer effects) {
		long __functionAddress = getInstance().alDeleteEffects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDeleteEffects(effects.remaining(), memAddress(effects), __functionAddress);
	}

	/** Single value version of: {@link #alDeleteEffects alDeleteEffects} */
	public static void alDeleteEffects(int effect) {
		long __functionAddress = getInstance().alDeleteEffects;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int effects = __buffer.intParam(effect);
		nalDeleteEffects(1, __buffer.address() + effects, __functionAddress);
	}

	// --- [ alIsEffect ] ---

	/** JNI method for {@link #alIsEffect alIsEffect} */
	public static native boolean nalIsEffect(int effect, long __functionAddress);

	/**
	 * Verifies whether the given object name is an effect.
	 *
	 * @param effect a value that may be a effect name
	 */
	public static boolean alIsEffect(int effect) {
		long __functionAddress = getInstance().alIsEffect;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsEffect(effect, __functionAddress);
	}

	// --- [ alEffecti ] ---

	/** JNI method for {@link #alEffecti alEffecti} */
	public static native void nalEffecti(int effect, int param, int value, long __functionAddress);

	/**
	 * Sets the integer value of an effect parameter.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alEffecti(int effect, int param, int value) {
		long __functionAddress = getInstance().alEffecti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffecti(effect, param, value, __functionAddress);
	}

	// --- [ alEffectiv ] ---

	/** JNI method for {@link #alEffecti(int, int, ByteBuffer) alEffecti} */
	public static native void nalEffectiv(int effect, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alEffecti alEffecti}.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alEffecti(int effect, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alEffectiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffectiv(effect, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alEffecti(int, int, ByteBuffer) alEffecti} */
	public static void alEffect(int effect, int param, IntBuffer values) {
		long __functionAddress = getInstance().alEffectiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffectiv(effect, param, memAddress(values), __functionAddress);
	}

	// --- [ alEffectf ] ---

	/** JNI method for {@link #alEffectf alEffectf} */
	public static native void nalEffectf(int effect, int param, float value, long __functionAddress);

	/**
	 * Sets the float value of an effect parameter.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alEffectf(int effect, int param, float value) {
		long __functionAddress = getInstance().alEffectf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffectf(effect, param, value, __functionAddress);
	}

	// --- [ alEffectfv ] ---

	/** JNI method for {@link #alEffectf(int, int, ByteBuffer) alEffectf} */
	public static native void nalEffectfv(int effect, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alEffectf alEffectf}.
	 *
	 * @param effect the effect to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alEffectf(int effect, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alEffectfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffectfv(effect, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alEffectf(int, int, ByteBuffer) alEffectf} */
	public static void alEffect(int effect, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alEffectfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalEffectfv(effect, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetEffecti ] ---

	/** JNI method for {@link #alGetEffecti alGetEffecti} */
	public static native void nalGetEffecti(int effect, int param, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetEffecti(int effect, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetEffecti;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetEffecti(effect, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetEffecti alGetEffecti} */
	public static void alGetEffect(int effect, int param, IntBuffer value) {
		long __functionAddress = getInstance().alGetEffecti;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetEffecti(effect, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetEffecti alGetEffecti} */
	public static int alGetEffecti(int effect, int param) {
		long __functionAddress = getInstance().alGetEffecti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetEffecti(effect, param, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alGetEffectiv ] ---

	/** JNI method for {@link #alGetEffectiv alGetEffectiv} */
	public static native void nalGetEffectiv(int effect, int param, long values, long __functionAddress);

	/**
	 * Returns the integer values of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetEffectiv(int effect, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetEffectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetEffectiv(effect, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetEffectiv alGetEffectiv} */
	public static void alGetEffectiv(int effect, int param, IntBuffer values) {
		long __functionAddress = getInstance().alGetEffectiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetEffectiv(effect, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetEffectf ] ---

	/** JNI method for {@link #alGetEffectf alGetEffectf} */
	public static native void nalGetEffectf(int effect, int param, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetEffectf(int effect, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetEffectf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetEffectf(effect, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetEffectf alGetEffectf} */
	public static void alGetEffect(int effect, int param, FloatBuffer value) {
		long __functionAddress = getInstance().alGetEffectf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetEffectf(effect, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetEffectf alGetEffectf} */
	public static float alGetEffectf(int effect, int param) {
		long __functionAddress = getInstance().alGetEffectf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetEffectf(effect, param, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetEffectfv ] ---

	/** JNI method for {@link #alGetEffectfv alGetEffectfv} */
	public static native void nalGetEffectfv(int effect, int param, long values, long __functionAddress);

	/**
	 * Returns the float values of the specified effect parameter.
	 *
	 * @param effect the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetEffectfv(int effect, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetEffectfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetEffectfv(effect, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetEffectfv alGetEffectfv} */
	public static void alGetEffectfv(int effect, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alGetEffectfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetEffectfv(effect, param, memAddress(values), __functionAddress);
	}

	// --- [ alGenFilters ] ---

	/** JNI method for {@link #alGenFilters alGenFilters} */
	public static native void nalGenFilters(int n, long filters, long __functionAddress);

	/**
	 * Requests a number of filters.
	 *
	 * @param n       the number of filters be to generated
	 * @param filters the buffer that will receive the filters
	 */
	public static void alGenFilters(int n, ByteBuffer filters) {
		long __functionAddress = getInstance().alGenFilters;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(filters, n << 2);
		}
		nalGenFilters(n, memAddress(filters), __functionAddress);
	}

	/** Alternative version of: {@link #alGenFilters alGenFilters} */
	public static void alGenFilters(IntBuffer filters) {
		long __functionAddress = getInstance().alGenFilters;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGenFilters(filters.remaining(), memAddress(filters), __functionAddress);
	}

	/** Single return value version of: {@link #alGenFilters alGenFilters} */
	public static int alGenFilters() {
		long __functionAddress = getInstance().alGenFilters;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int filters = __buffer.intParam();
		nalGenFilters(1, __buffer.address() + filters, __functionAddress);
		return __buffer.intValue(filters);
	}

	// --- [ alDeleteFilters ] ---

	/** JNI method for {@link #alDeleteFilters alDeleteFilters} */
	public static native void nalDeleteFilters(int n, long filters, long __functionAddress);

	/**
	 * Deletes a number of filters.
	 *
	 * @param n       the number of filters be to deleted
	 * @param filters the filter to delete
	 */
	public static void alDeleteFilters(int n, ByteBuffer filters) {
		long __functionAddress = getInstance().alDeleteFilters;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(filters, n << 2);
		}
		nalDeleteFilters(n, memAddress(filters), __functionAddress);
	}

	/** Alternative version of: {@link #alDeleteFilters alDeleteFilters} */
	public static void alDeleteFilters(IntBuffer filters) {
		long __functionAddress = getInstance().alDeleteFilters;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDeleteFilters(filters.remaining(), memAddress(filters), __functionAddress);
	}

	/** Single value version of: {@link #alDeleteFilters alDeleteFilters} */
	public static void alDeleteFilters(int filter) {
		long __functionAddress = getInstance().alDeleteFilters;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int filters = __buffer.intParam(filter);
		nalDeleteFilters(1, __buffer.address() + filters, __functionAddress);
	}

	// --- [ alIsFilter ] ---

	/** JNI method for {@link #alIsFilter alIsFilter} */
	public static native boolean nalIsFilter(int filter, long __functionAddress);

	/**
	 * Verifies whether the given object name is a filter.
	 *
	 * @param filter a value that may be a filter name
	 */
	public static boolean alIsFilter(int filter) {
		long __functionAddress = getInstance().alIsFilter;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsFilter(filter, __functionAddress);
	}

	// --- [ alFilteri ] ---

	/** JNI method for {@link #alFilteri alFilteri} */
	public static native void nalFilteri(int filter, int param, int value, long __functionAddress);

	/**
	 * Sets the integer value of a filter parameter.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alFilteri(int filter, int param, int value) {
		long __functionAddress = getInstance().alFilteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilteri(filter, param, value, __functionAddress);
	}

	// --- [ alFilteriv ] ---

	/** JNI method for {@link #alFilteri(int, int, ByteBuffer) alFilteri} */
	public static native void nalFilteriv(int filter, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alFilteri alFilteri}.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alFilteri(int filter, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alFilteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilteriv(filter, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alFilteri(int, int, ByteBuffer) alFilteri} */
	public static void alFilter(int filter, int param, IntBuffer values) {
		long __functionAddress = getInstance().alFilteriv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilteriv(filter, param, memAddress(values), __functionAddress);
	}

	// --- [ alFilterf ] ---

	/** JNI method for {@link #alFilterf alFilterf} */
	public static native void nalFilterf(int filter, int param, float value, long __functionAddress);

	/**
	 * Sets the float value of a filter parameter.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param value  the parameter value
	 */
	public static void alFilterf(int filter, int param, float value) {
		long __functionAddress = getInstance().alFilterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilterf(filter, param, value, __functionAddress);
	}

	// --- [ alFilterfv ] ---

	/** JNI method for {@link #alFilterf(int, int, ByteBuffer) alFilterf} */
	public static native void nalFilterfv(int filter, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alFilterf alFilterf}.
	 *
	 * @param filter the filter to modify
	 * @param param  the parameter to modify
	 * @param values the parameter values
	 */
	public static void alFilterf(int filter, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alFilterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilterfv(filter, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alFilterf(int, int, ByteBuffer) alFilterf} */
	public static void alFilter(int filter, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alFilterfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalFilterfv(filter, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetFilteri ] ---

	/** JNI method for {@link #alGetFilteri alGetFilteri} */
	public static native void nalGetFilteri(int filter, int param, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified filter parameter.
	 *
	 * @param filter the filter to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetFilteri(int filter, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetFilteri;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetFilteri(filter, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetFilteri alGetFilteri} */
	public static void alGetFilter(int filter, int param, IntBuffer value) {
		long __functionAddress = getInstance().alGetFilteri;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetFilteri(filter, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetFilteri alGetFilteri} */
	public static int alGetFilteri(int filter, int param) {
		long __functionAddress = getInstance().alGetFilteri;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetFilteri(filter, param, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alGetFilteriv ] ---

	/** JNI method for {@link #alGetFilteriv alGetFilteriv} */
	public static native void nalGetFilteriv(int filter, int param, long values, long __functionAddress);

	/**
	 * Returns the integer values of the specified filter parameter.
	 *
	 * @param filter the filter to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetFilteriv(int filter, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetFilteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetFilteriv(filter, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetFilteriv alGetFilteriv} */
	public static void alGetFilteriv(int filter, int param, IntBuffer values) {
		long __functionAddress = getInstance().alGetFilteriv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetFilteriv(filter, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetFilterf ] ---

	/** JNI method for {@link #alGetFilterf alGetFilterf} */
	public static native void nalGetFilterf(int filter, int param, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified filter parameter.
	 *
	 * @param filter the effect to query
	 * @param param  the parameter to query
	 * @param value  the parameter value
	 */
	public static void alGetFilterf(int filter, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetFilterf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetFilterf(filter, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetFilterf alGetFilterf} */
	public static void alGetFilter(int filter, int param, FloatBuffer value) {
		long __functionAddress = getInstance().alGetFilterf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetFilterf(filter, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetFilterf alGetFilterf} */
	public static float alGetFilterf(int filter, int param) {
		long __functionAddress = getInstance().alGetFilterf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetFilterf(filter, param, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetFilterfv ] ---

	/** JNI method for {@link #alGetFilterfv alGetFilterfv} */
	public static native void nalGetFilterfv(int filter, int param, long values, long __functionAddress);

	/**
	 * Returns the float values of the specified filter parameter.
	 *
	 * @param filter the effect to query
	 * @param param  the parameter to query
	 * @param values the parameter values
	 */
	public static void alGetFilterfv(int filter, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetFilterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetFilterfv(filter, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetFilterfv alGetFilterfv} */
	public static void alGetFilterfv(int filter, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alGetFilterfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetFilterfv(filter, param, memAddress(values), __functionAddress);
	}

	// --- [ alGenAuxiliaryEffectSlots ] ---

	/** JNI method for {@link #alGenAuxiliaryEffectSlots alGenAuxiliaryEffectSlots} */
	public static native void nalGenAuxiliaryEffectSlots(int n, long effectSlots, long __functionAddress);

	/**
	 * Requests a number of effect slots.
	 *
	 * @param n           the number of effect slots be to generated
	 * @param effectSlots the buffer that will receive the effect slots
	 */
	public static void alGenAuxiliaryEffectSlots(int n, ByteBuffer effectSlots) {
		long __functionAddress = getInstance().alGenAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(effectSlots, n << 2);
		}
		nalGenAuxiliaryEffectSlots(n, memAddress(effectSlots), __functionAddress);
	}

	/** Alternative version of: {@link #alGenAuxiliaryEffectSlots alGenAuxiliaryEffectSlots} */
	public static void alGenAuxiliaryEffectSlots(IntBuffer effectSlots) {
		long __functionAddress = getInstance().alGenAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalGenAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots), __functionAddress);
	}

	/** Single return value version of: {@link #alGenAuxiliaryEffectSlots alGenAuxiliaryEffectSlots} */
	public static int alGenAuxiliaryEffectSlots() {
		long __functionAddress = getInstance().alGenAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int effectSlots = __buffer.intParam();
		nalGenAuxiliaryEffectSlots(1, __buffer.address() + effectSlots, __functionAddress);
		return __buffer.intValue(effectSlots);
	}

	// --- [ alDeleteAuxiliaryEffectSlots ] ---

	/** JNI method for {@link #alDeleteAuxiliaryEffectSlots alDeleteAuxiliaryEffectSlots} */
	public static native void nalDeleteAuxiliaryEffectSlots(int n, long effectSlots, long __functionAddress);

	/**
	 * Deletes a number of effect slots.
	 *
	 * @param n           the number of effect slots be to deleted
	 * @param effectSlots the effectSlot to delete
	 */
	public static void alDeleteAuxiliaryEffectSlots(int n, ByteBuffer effectSlots) {
		long __functionAddress = getInstance().alDeleteAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(effectSlots, n << 2);
		}
		nalDeleteAuxiliaryEffectSlots(n, memAddress(effectSlots), __functionAddress);
	}

	/** Alternative version of: {@link #alDeleteAuxiliaryEffectSlots alDeleteAuxiliaryEffectSlots} */
	public static void alDeleteAuxiliaryEffectSlots(IntBuffer effectSlots) {
		long __functionAddress = getInstance().alDeleteAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalDeleteAuxiliaryEffectSlots(effectSlots.remaining(), memAddress(effectSlots), __functionAddress);
	}

	/** Single value version of: {@link #alDeleteAuxiliaryEffectSlots alDeleteAuxiliaryEffectSlots} */
	public static void alDeleteAuxiliaryEffectSlots(int effectSlot) {
		long __functionAddress = getInstance().alDeleteAuxiliaryEffectSlots;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int effectSlots = __buffer.intParam(effectSlot);
		nalDeleteAuxiliaryEffectSlots(1, __buffer.address() + effectSlots, __functionAddress);
	}

	// --- [ alIsAuxiliaryEffectSlot ] ---

	/** JNI method for {@link #alIsAuxiliaryEffectSlot alIsAuxiliaryEffectSlot} */
	public static native boolean nalIsAuxiliaryEffectSlot(int effectSlot, long __functionAddress);

	/**
	 * Verifies whether the given object name is an effect slot.
	 *
	 * @param effectSlot a value that may be an effect slot name
	 */
	public static boolean alIsAuxiliaryEffectSlot(int effectSlot) {
		long __functionAddress = getInstance().alIsAuxiliaryEffectSlot;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nalIsAuxiliaryEffectSlot(effectSlot, __functionAddress);
	}

	// --- [ alAuxiliaryEffectSloti ] ---

	/** JNI method for {@link #alAuxiliaryEffectSloti alAuxiliaryEffectSloti} */
	public static native void nalAuxiliaryEffectSloti(int effectSlot, int param, int value, long __functionAddress);

	/**
	 * Sets the integer value of an effect slot parameter.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param value      the parameter value
	 */
	public static void alAuxiliaryEffectSloti(int effectSlot, int param, int value) {
		long __functionAddress = getInstance().alAuxiliaryEffectSloti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSloti(effectSlot, param, value, __functionAddress);
	}

	// --- [ alAuxiliaryEffectSlotiv ] ---

	/** JNI method for {@link #alAuxiliaryEffectSloti(int, int, ByteBuffer) alAuxiliaryEffectSloti} */
	public static native void nalAuxiliaryEffectSlotiv(int effectSlot, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alAuxiliaryEffectSloti alAuxiliaryEffectSloti}.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param values     the parameter values
	 */
	public static void alAuxiliaryEffectSloti(int effectSlot, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alAuxiliaryEffectSlotiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alAuxiliaryEffectSloti(int, int, ByteBuffer) alAuxiliaryEffectSloti} */
	public static void alAuxiliaryEffectSlot(int effectSlot, int param, IntBuffer values) {
		long __functionAddress = getInstance().alAuxiliaryEffectSlotiv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values), __functionAddress);
	}

	// --- [ alAuxiliaryEffectSlotf ] ---

	/** JNI method for {@link #alAuxiliaryEffectSlotf alAuxiliaryEffectSlotf} */
	public static native void nalAuxiliaryEffectSlotf(int effectSlot, int param, float value, long __functionAddress);

	/**
	 * Sets the float value of an effect slot parameter.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param value      the parameter value
	 */
	public static void alAuxiliaryEffectSlotf(int effectSlot, int param, float value) {
		long __functionAddress = getInstance().alAuxiliaryEffectSlotf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSlotf(effectSlot, param, value, __functionAddress);
	}

	// --- [ alAuxiliaryEffectSlotfv ] ---

	/** JNI method for {@link #alAuxiliaryEffectSlotf(int, int, ByteBuffer) alAuxiliaryEffectSlotf} */
	public static native void nalAuxiliaryEffectSlotfv(int effectSlot, int param, long values, long __functionAddress);

	/**
	 * Pointer version of {@link #alAuxiliaryEffectSlotf alAuxiliaryEffectSlotf}.
	 *
	 * @param effectSlot the effect slot to modify
	 * @param param      the parameter to modify
	 * @param values     the parameter values
	 */
	public static void alAuxiliaryEffectSlotf(int effectSlot, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alAuxiliaryEffectSlotfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alAuxiliaryEffectSlotf(int, int, ByteBuffer) alAuxiliaryEffectSlotf} */
	public static void alAuxiliaryEffectSlot(int effectSlot, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alAuxiliaryEffectSlotfv;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		nalAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetAuxiliaryEffectSloti ] ---

	/** JNI method for {@link #alGetAuxiliaryEffectSloti alGetAuxiliaryEffectSloti} */
	public static native void nalGetAuxiliaryEffectSloti(int effectSlot, int param, long value, long __functionAddress);

	/**
	 * Returns the integer value of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param value      the parameter value
	 */
	public static void alGetAuxiliaryEffectSloti(int effectSlot, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSloti;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSloti alGetAuxiliaryEffectSloti} */
	public static void alGetAuxiliaryEffectSlot(int effectSlot, int param, IntBuffer value) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSloti;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetAuxiliaryEffectSloti(effectSlot, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetAuxiliaryEffectSloti alGetAuxiliaryEffectSloti} */
	public static int alGetAuxiliaryEffectSloti(int effectSlot, int param) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSloti;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.intParam();
		nalGetAuxiliaryEffectSloti(effectSlot, param, __buffer.address() + value, __functionAddress);
		return __buffer.intValue(value);
	}

	// --- [ alGetAuxiliaryEffectSlotiv ] ---

	/** JNI method for {@link #alGetAuxiliaryEffectSlotiv alGetAuxiliaryEffectSlotiv} */
	public static native void nalGetAuxiliaryEffectSlotiv(int effectSlot, int param, long values, long __functionAddress);

	/**
	 * Returns the integer values of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param values     the parameter values
	 */
	public static void alGetAuxiliaryEffectSlotiv(int effectSlot, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotiv alGetAuxiliaryEffectSlotiv} */
	public static void alGetAuxiliaryEffectSlotiv(int effectSlot, int param, IntBuffer values) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotiv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetAuxiliaryEffectSlotiv(effectSlot, param, memAddress(values), __functionAddress);
	}

	// --- [ alGetAuxiliaryEffectSlotf ] ---

	/** JNI method for {@link #alGetAuxiliaryEffectSlotf alGetAuxiliaryEffectSlotf} */
	public static native void nalGetAuxiliaryEffectSlotf(int effectSlot, int param, long value, long __functionAddress);

	/**
	 * Returns the float value of the specified filter parameter.
	 *
	 * @param effectSlot the effect slot to query
	 * @param param      the parameter to query
	 * @param value      the parameter value
	 */
	public static void alGetAuxiliaryEffectSlotf(int effectSlot, int param, ByteBuffer value) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1 << 2);
		}
		nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value), __functionAddress);
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotf alGetAuxiliaryEffectSlotf} */
	public static void alGetAuxiliaryEffectSlot(int effectSlot, int param, FloatBuffer value) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotf;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(value, 1);
		}
		nalGetAuxiliaryEffectSlotf(effectSlot, param, memAddress(value), __functionAddress);
	}

	/** Single return value version of: {@link #alGetAuxiliaryEffectSlotf alGetAuxiliaryEffectSlotf} */
	public static float alGetAuxiliaryEffectSlotf(int effectSlot, int param) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotf;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		APIBuffer __buffer = apiBuffer();
		int value = __buffer.floatParam();
		nalGetAuxiliaryEffectSlotf(effectSlot, param, __buffer.address() + value, __functionAddress);
		return __buffer.floatValue(value);
	}

	// --- [ alGetAuxiliaryEffectSlotfv ] ---

	/** JNI method for {@link #alGetAuxiliaryEffectSlotfv alGetAuxiliaryEffectSlotfv} */
	public static native void nalGetAuxiliaryEffectSlotfv(int effectSlot, int param, long values, long __functionAddress);

	/**
	 * Returns the float values of the specified effect slot parameter.
	 *
	 * @param effectSlot the effect to query
	 * @param param      the parameter to query
	 * @param values     the parameter values
	 */
	public static void alGetAuxiliaryEffectSlotfv(int effectSlot, int param, ByteBuffer values) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1 << 2);
		}
		nalGetAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values), __functionAddress);
	}

	/** Alternative version of: {@link #alGetAuxiliaryEffectSlotfv alGetAuxiliaryEffectSlotfv} */
	public static void alGetAuxiliaryEffectSlotfv(int effectSlot, int param, FloatBuffer values) {
		long __functionAddress = getInstance().alGetAuxiliaryEffectSlotfv;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkBuffer(values, 1);
		}
		nalGetAuxiliaryEffectSlotfv(effectSlot, param, memAddress(values), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance() {
		return AL.getCapabilities().__EXTEfx;
	}

	static Functions create(java.util.Set<String> ext, FunctionProvider provider) {
		if ( !ext.contains("ALC_EXT_EFX") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported = 
			funcs.alGenEffects != 0L &&
			funcs.alDeleteEffects != 0L &&
			funcs.alIsEffect != 0L &&
			funcs.alEffecti != 0L &&
			funcs.alEffectiv != 0L &&
			funcs.alEffectf != 0L &&
			funcs.alEffectfv != 0L &&
			funcs.alGetEffecti != 0L &&
			funcs.alGetEffectiv != 0L &&
			funcs.alGetEffectf != 0L &&
			funcs.alGetEffectfv != 0L &&
			funcs.alGenFilters != 0L &&
			funcs.alDeleteFilters != 0L &&
			funcs.alIsFilter != 0L &&
			funcs.alFilteri != 0L &&
			funcs.alFilteriv != 0L &&
			funcs.alFilterf != 0L &&
			funcs.alFilterfv != 0L &&
			funcs.alGetFilteri != 0L &&
			funcs.alGetFilteriv != 0L &&
			funcs.alGetFilterf != 0L &&
			funcs.alGetFilterfv != 0L &&
			funcs.alGenAuxiliaryEffectSlots != 0L &&
			funcs.alDeleteAuxiliaryEffectSlots != 0L &&
			funcs.alIsAuxiliaryEffectSlot != 0L &&
			funcs.alAuxiliaryEffectSloti != 0L &&
			funcs.alAuxiliaryEffectSlotiv != 0L &&
			funcs.alAuxiliaryEffectSlotf != 0L &&
			funcs.alAuxiliaryEffectSlotfv != 0L &&
			funcs.alGetAuxiliaryEffectSloti != 0L &&
			funcs.alGetAuxiliaryEffectSlotiv != 0L &&
			funcs.alGetAuxiliaryEffectSlotf != 0L &&
			funcs.alGetAuxiliaryEffectSlotfv != 0L;

		return AL.checkExtension("ALC_EXT_EFX", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code EXTEfx}. */
	public static final class Functions implements FunctionMap {

		public final long
			alGenEffects,
			alDeleteEffects,
			alIsEffect,
			alEffecti,
			alEffectiv,
			alEffectf,
			alEffectfv,
			alGetEffecti,
			alGetEffectiv,
			alGetEffectf,
			alGetEffectfv,
			alGenFilters,
			alDeleteFilters,
			alIsFilter,
			alFilteri,
			alFilteriv,
			alFilterf,
			alFilterfv,
			alGetFilteri,
			alGetFilteriv,
			alGetFilterf,
			alGetFilterfv,
			alGenAuxiliaryEffectSlots,
			alDeleteAuxiliaryEffectSlots,
			alIsAuxiliaryEffectSlot,
			alAuxiliaryEffectSloti,
			alAuxiliaryEffectSlotiv,
			alAuxiliaryEffectSlotf,
			alAuxiliaryEffectSlotfv,
			alGetAuxiliaryEffectSloti,
			alGetAuxiliaryEffectSlotiv,
			alGetAuxiliaryEffectSlotf,
			alGetAuxiliaryEffectSlotfv;

		public Functions(FunctionProvider provider) {
			alGenEffects = provider.getFunctionAddress("alGenEffects");
			alDeleteEffects = provider.getFunctionAddress("alDeleteEffects");
			alIsEffect = provider.getFunctionAddress("alIsEffect");
			alEffecti = provider.getFunctionAddress("alEffecti");
			alEffectiv = provider.getFunctionAddress("alEffectiv");
			alEffectf = provider.getFunctionAddress("alEffectf");
			alEffectfv = provider.getFunctionAddress("alEffectfv");
			alGetEffecti = provider.getFunctionAddress("alGetEffecti");
			alGetEffectiv = provider.getFunctionAddress("alGetEffectiv");
			alGetEffectf = provider.getFunctionAddress("alGetEffectf");
			alGetEffectfv = provider.getFunctionAddress("alGetEffectfv");
			alGenFilters = provider.getFunctionAddress("alGenFilters");
			alDeleteFilters = provider.getFunctionAddress("alDeleteFilters");
			alIsFilter = provider.getFunctionAddress("alIsFilter");
			alFilteri = provider.getFunctionAddress("alFilteri");
			alFilteriv = provider.getFunctionAddress("alFilteriv");
			alFilterf = provider.getFunctionAddress("alFilterf");
			alFilterfv = provider.getFunctionAddress("alFilterfv");
			alGetFilteri = provider.getFunctionAddress("alGetFilteri");
			alGetFilteriv = provider.getFunctionAddress("alGetFilteriv");
			alGetFilterf = provider.getFunctionAddress("alGetFilterf");
			alGetFilterfv = provider.getFunctionAddress("alGetFilterfv");
			alGenAuxiliaryEffectSlots = provider.getFunctionAddress("alGenAuxiliaryEffectSlots");
			alDeleteAuxiliaryEffectSlots = provider.getFunctionAddress("alDeleteAuxiliaryEffectSlots");
			alIsAuxiliaryEffectSlot = provider.getFunctionAddress("alIsAuxiliaryEffectSlot");
			alAuxiliaryEffectSloti = provider.getFunctionAddress("alAuxiliaryEffectSloti");
			alAuxiliaryEffectSlotiv = provider.getFunctionAddress("alAuxiliaryEffectSlotiv");
			alAuxiliaryEffectSlotf = provider.getFunctionAddress("alAuxiliaryEffectSlotf");
			alAuxiliaryEffectSlotfv = provider.getFunctionAddress("alAuxiliaryEffectSlotfv");
			alGetAuxiliaryEffectSloti = provider.getFunctionAddress("alGetAuxiliaryEffectSloti");
			alGetAuxiliaryEffectSlotiv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotiv");
			alGetAuxiliaryEffectSlotf = provider.getFunctionAddress("alGetAuxiliaryEffectSlotf");
			alGetAuxiliaryEffectSlotfv = provider.getFunctionAddress("alGetAuxiliaryEffectSlotfv");
		}

	}

}